package com.ex.project.service.impl;

import com.ex.project.mapper.GoodsInfoMapper;
import com.ex.project.mapper.OrderInfoMapper;
import com.ex.project.mapper.UserInfoMapper;
import com.ex.project.model.GoodsInfo;
import com.ex.project.model.OrderInfo;
import com.ex.project.model.UserInfo;
import com.ex.project.service.OrderInfoService;
import com.ex.project.untill.CodeConsts;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderInfoServiceImpl implements OrderInfoService {

    @Resource
    private OrderInfoMapper orderInfoMapper;
    @Resource
    private GoodsInfoMapper goodsInfoMapper;
    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public int add_order(OrderInfo orderInfo) {
        GoodsInfo g = goodsInfoMapper.selectByPrimaryKey(orderInfo.getgId());
        orderInfo.setsId(g.getsId());
        int returnData = orderInfoMapper.insertSelective(orderInfo);
        return returnData;
    }

    @Override
    public int del_order(OrderInfo orderInfo) {
        int returnData = orderInfoMapper.deleteByPrimaryKey(orderInfo.getoId());
        return returnData;
    }

    @Override
    public int up_order(OrderInfo orderInfo) {
        int flag = CodeConsts.ZT_SB;
        int returnData = CodeConsts.ZT_SB;
        switch (orderInfo.getoStatus()) {
            //已付款
            case CodeConsts.DDZT_YFK:
                flag = ChangeMoney(orderInfo.getoId(), orderInfo.getoStatus());
                break;
            //6同意退货
            case CodeConsts.DDZT_TYTH:
                flag = ChangeMoney(orderInfo.getoId(), orderInfo.getoStatus());
                break;
            default:
                flag = 1;
        }
        if (flag == CodeConsts.ZT_CG) {
            returnData = orderInfoMapper.updateByPrimaryKeySelective(orderInfo);
        }
        return returnData;
    }

    @Override
    public OrderInfo sel_a_order(OrderInfo orderInfo) {
        OrderInfo returnData = orderInfoMapper.selectByPrimaryKey(orderInfo.getoId());
        return returnData;
    }

    @Override
    public PageInfo<OrderInfo> sel_all_order(OrderInfo orderInfo) {
        PageHelper.startPage(orderInfo.getCurrentPage(), orderInfo.getPageSize());
        List<OrderInfo> a = orderInfoMapper.selAllOrderBy(orderInfo);
        PageInfo<OrderInfo> returnData = new PageInfo<>(a);
        return returnData;
    }

    /**
     * @return int
     * @Author lx
     * @Description 改变钱
     * @Date 22:38 2020/2/2
     * @Param [oId]
     **/
    @Transactional(rollbackFor = Exception.class)
    public int ChangeMoney(Integer oId, Integer oStatus) {
        try {
            OrderInfo orderInfo = orderInfoMapper.selectByPrimaryKey(oId);
            Double countPrice = orderInfo.getCountPrice();
            Integer uId = orderInfo.getuId();
            UserInfo userInfo = userInfoMapper.selectByPrimaryKey(orderInfo.getuId());
            Double beforeMoney = userInfo.getMoney();
            Double UserAfterMoney = 0.0;
            Double ShopAfterMoney = 0.0;
            Double ShopMoney = 0.0;
            switch (oStatus) {
                case CodeConsts.DDZT_YFK:
                    UserAfterMoney = userInfo.getMoney() - orderInfo.getCountPrice();
                    ShopAfterMoney = ShopMoney + orderInfo.getCountPrice();
                    break;
                case CodeConsts.DDZT_TYTH:
                    UserAfterMoney = userInfo.getMoney() + orderInfo.getCountPrice();
                    ShopAfterMoney = ShopMoney - orderInfo.getCountPrice();
                    break;
            }
            userInfo.setMoney(UserAfterMoney);

            int upUser = userInfoMapper.updateByPrimaryKeySelective(userInfo);

            return upUser;
        } catch (Exception e) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return 0;

        }
    }


}
