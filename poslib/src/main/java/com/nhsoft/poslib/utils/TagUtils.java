package com.nhsoft.poslib.utils;

import android.text.TextUtils;

import com.nhsoft.poslib.RetailPosManager;
import com.nhsoft.poslib.entity.order.Payment;
import com.nhsoft.poslib.entity.order.PosOrderDetail;
import com.nhsoft.poslib.libconfig.LibConfig;

/**
 * Created by Iverson on 2019/3/5 4:25 PM
 * 此类用于：
 */
public class TagUtils {

    /**
     * 删除会员标记
     * @param posOrderDetail
     */
    public static void removeVipTag(PosOrderDetail posOrderDetail){
        String orderDetailMemo = posOrderDetail.getOrderDetailMemo();
        if(!TextUtils.isEmpty(orderDetailMemo)){
            orderDetailMemo = orderDetailMemo.replace(LibConfig.GOODS_VIP_TAG, "");
            posOrderDetail.setOrderDetailMemo(orderDetailMemo);
        }
    }

    /**
     * 添加会员标记
     * @param posOrderDetail
     */
    public static void addVipTag(PosOrderDetail posOrderDetail){
        String orderDetailMemo = posOrderDetail.getOrderDetailMemo();
        if(!TextUtils.isEmpty(orderDetailMemo)){
            if(orderDetailMemo.contains(LibConfig.GOODS_VIP_TAG))return;
            posOrderDetail.setOrderDetailMemo(new StringBuilder().append(orderDetailMemo).append(LibConfig.GOODS_VIP_TAG).toString());
        }else {
            posOrderDetail.setOrderDetailMemo(new StringBuilder().append(LibConfig.GOODS_VIP_TAG).toString());
        }
    }


    /**
     * 删除手改标记
     * @param posOrderDetail
     */
    public static void removeChangeTag(PosOrderDetail posOrderDetail){
        String orderDetailMemo = posOrderDetail.getOrderDetailMemo();
        if(!TextUtils.isEmpty(orderDetailMemo)){
            orderDetailMemo = orderDetailMemo.replace(LibConfig.GOODS_CHANGE_TAG,"");
            posOrderDetail.setOrderDetailMemo(orderDetailMemo);
        }
    }

    /**
     * 添加手改标记
     * @param posOrderDetail
     */
    public static void addChangeTag(PosOrderDetail posOrderDetail,float detailPrice){
        String orderDetailMemo = posOrderDetail.getOrderDetailMemo();
        if(!TextUtils.isEmpty(orderDetailMemo)){
            posOrderDetail.setOrderDetailMemo(new StringBuilder().append(orderDetailMemo).append(LibConfig.GOODS_CHANGE_TAG).toString());
        }else {
            if(orderDetailMemo.contains(LibConfig.GOODS_CHANGE_TAG))return;
            posOrderDetail.setOrderDetailMemo(new StringBuilder().append(LibConfig.GOODS_CHANGE_TAG).toString());
        }
         RetailPosManager.getInstance().tryChangeGoodsPrice(posOrderDetail,detailPrice);
    }

    /**
     * 添加手改标记
     * @param posOrderDetail
     */
    public static void addChangeTag(PosOrderDetail posOrderDetail){
        String orderDetailMemo = posOrderDetail.getOrderDetailMemo();
        if(!TextUtils.isEmpty(orderDetailMemo)){
            posOrderDetail.setOrderDetailMemo(new StringBuilder().append(orderDetailMemo).append(LibConfig.GOODS_CHANGE_TAG).toString());
        }else {
            if(orderDetailMemo.contains(LibConfig.GOODS_CHANGE_TAG))return;
            posOrderDetail.setOrderDetailMemo(new StringBuilder().append(LibConfig.GOODS_CHANGE_TAG).toString());
        }
        RetailPosManager.getInstance().tryChangeGoodsPrice(posOrderDetail,posOrderDetail.getOrderDetailPrice());
    }


    /**
     * Payment添加备注
     * @param payment
     */
    public static void addPaymentMemo(Payment payment){
        String paymentMemo = payment.getPaymentMemo();
        if(!TextUtils.isEmpty(paymentMemo)){
            payment.setPaymentMemo(new StringBuilder().append(paymentMemo).append("第三方在线支付").toString());
        }else {
            if(paymentMemo.contains("第三方在线支付"))return;
            payment.setPaymentMemo(new StringBuilder().append("第三方在线支付").toString());
        }
    }

}
