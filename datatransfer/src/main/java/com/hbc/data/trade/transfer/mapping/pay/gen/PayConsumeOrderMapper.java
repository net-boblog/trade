package com.hbc.data.trade.transfer.mapping.pay.gen;

import com.hbc.data.trade.transfer.mapping.pay.gen.bean.PayConsumeOrder;
import com.hbc.data.trade.transfer.mapping.pay.gen.bean.PayConsumeOrderCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface PayConsumeOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_consume_order`
     *
     * @mbggenerated
     */
    @SelectProvider(type=PayConsumeOrderSqlProvider.class, method="countByExample")
    int countByExample(PayConsumeOrderCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_consume_order`
     *
     * @mbggenerated
     */
    @DeleteProvider(type=PayConsumeOrderSqlProvider.class, method="deleteByExample")
    int deleteByExample(PayConsumeOrderCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_consume_order`
     *
     * @mbggenerated
     */
    @Delete({
        "delete from `pay_consume_order`",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_consume_order`
     *
     * @mbggenerated
     */
    @Insert({
        "insert into `pay_consume_order` (id, user_id, ",
        "account_id, channel, ",
        "status, create_time, ",
        "pay_time, recharge_id, ",
        "consume_amount, recharge_amount, ",
        "subject, body, busi_consume_no, ",
        "busi_show_url, city_id, ",
        "refund_count, expire_time, ",
        "refund_amount, refund_time, ",
        "update_time, plat, ",
        "plat_ext, return_url, ",
        "callback_url, callback_status, ",
        "callback_count, callback_time)",
        "values (#{id,jdbcType=VARCHAR}, #{userId,jdbcType=VARCHAR}, ",
        "#{accountId,jdbcType=VARCHAR}, #{channel,jdbcType=INTEGER}, ",
        "#{status,jdbcType=INTEGER}, #{createTime,jdbcType=INTEGER}, ",
        "#{payTime,jdbcType=INTEGER}, #{rechargeId,jdbcType=VARCHAR}, ",
        "#{consumeAmount,jdbcType=INTEGER}, #{rechargeAmount,jdbcType=INTEGER}, ",
        "#{subject,jdbcType=VARCHAR}, #{body,jdbcType=VARCHAR}, #{busiConsumeNo,jdbcType=VARCHAR}, ",
        "#{busiShowUrl,jdbcType=VARCHAR}, #{cityId,jdbcType=INTEGER}, ",
        "#{refundCount,jdbcType=INTEGER}, #{expireTime,jdbcType=INTEGER}, ",
        "#{refundAmount,jdbcType=INTEGER}, #{refundTime,jdbcType=INTEGER}, ",
        "#{updateTime,jdbcType=INTEGER}, #{plat,jdbcType=INTEGER}, ",
        "#{platExt,jdbcType=VARCHAR}, #{returnUrl,jdbcType=VARCHAR}, ",
        "#{callbackUrl,jdbcType=VARCHAR}, #{callbackStatus,jdbcType=INTEGER}, ",
        "#{callbackCount,jdbcType=INTEGER}, #{callbackTime,jdbcType=INTEGER})"
    })
    int insert(PayConsumeOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_consume_order`
     *
     * @mbggenerated
     */
    @InsertProvider(type=PayConsumeOrderSqlProvider.class, method="insertSelective")
    int insertSelective(PayConsumeOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_consume_order`
     *
     * @mbggenerated
     */
    @SelectProvider(type=PayConsumeOrderSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="account_id", property="accountId", jdbcType=JdbcType.VARCHAR),
        @Result(column="channel", property="channel", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.INTEGER),
        @Result(column="pay_time", property="payTime", jdbcType=JdbcType.INTEGER),
        @Result(column="recharge_id", property="rechargeId", jdbcType=JdbcType.VARCHAR),
        @Result(column="consume_amount", property="consumeAmount", jdbcType=JdbcType.INTEGER),
        @Result(column="recharge_amount", property="rechargeAmount", jdbcType=JdbcType.INTEGER),
        @Result(column="subject", property="subject", jdbcType=JdbcType.VARCHAR),
        @Result(column="body", property="body", jdbcType=JdbcType.VARCHAR),
        @Result(column="busi_consume_no", property="busiConsumeNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="busi_show_url", property="busiShowUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="city_id", property="cityId", jdbcType=JdbcType.INTEGER),
        @Result(column="refund_count", property="refundCount", jdbcType=JdbcType.INTEGER),
        @Result(column="expire_time", property="expireTime", jdbcType=JdbcType.INTEGER),
        @Result(column="refund_amount", property="refundAmount", jdbcType=JdbcType.INTEGER),
        @Result(column="refund_time", property="refundTime", jdbcType=JdbcType.INTEGER),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.INTEGER),
        @Result(column="plat", property="plat", jdbcType=JdbcType.INTEGER),
        @Result(column="plat_ext", property="platExt", jdbcType=JdbcType.VARCHAR),
        @Result(column="return_url", property="returnUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="callback_url", property="callbackUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="callback_status", property="callbackStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="callback_count", property="callbackCount", jdbcType=JdbcType.INTEGER),
        @Result(column="callback_time", property="callbackTime", jdbcType=JdbcType.INTEGER)
    })
    List<PayConsumeOrder> selectByExampleWithRowbounds(PayConsumeOrderCriteria example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_consume_order`
     *
     * @mbggenerated
     */
    @SelectProvider(type=PayConsumeOrderSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="account_id", property="accountId", jdbcType=JdbcType.VARCHAR),
        @Result(column="channel", property="channel", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.INTEGER),
        @Result(column="pay_time", property="payTime", jdbcType=JdbcType.INTEGER),
        @Result(column="recharge_id", property="rechargeId", jdbcType=JdbcType.VARCHAR),
        @Result(column="consume_amount", property="consumeAmount", jdbcType=JdbcType.INTEGER),
        @Result(column="recharge_amount", property="rechargeAmount", jdbcType=JdbcType.INTEGER),
        @Result(column="subject", property="subject", jdbcType=JdbcType.VARCHAR),
        @Result(column="body", property="body", jdbcType=JdbcType.VARCHAR),
        @Result(column="busi_consume_no", property="busiConsumeNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="busi_show_url", property="busiShowUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="city_id", property="cityId", jdbcType=JdbcType.INTEGER),
        @Result(column="refund_count", property="refundCount", jdbcType=JdbcType.INTEGER),
        @Result(column="expire_time", property="expireTime", jdbcType=JdbcType.INTEGER),
        @Result(column="refund_amount", property="refundAmount", jdbcType=JdbcType.INTEGER),
        @Result(column="refund_time", property="refundTime", jdbcType=JdbcType.INTEGER),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.INTEGER),
        @Result(column="plat", property="plat", jdbcType=JdbcType.INTEGER),
        @Result(column="plat_ext", property="platExt", jdbcType=JdbcType.VARCHAR),
        @Result(column="return_url", property="returnUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="callback_url", property="callbackUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="callback_status", property="callbackStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="callback_count", property="callbackCount", jdbcType=JdbcType.INTEGER),
        @Result(column="callback_time", property="callbackTime", jdbcType=JdbcType.INTEGER)
    })
    List<PayConsumeOrder> selectByExample(PayConsumeOrderCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_consume_order`
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, user_id, account_id, channel, status, create_time, pay_time, recharge_id, ",
        "consume_amount, recharge_amount, subject, body, busi_consume_no, busi_show_url, ",
        "city_id, refund_count, expire_time, refund_amount, refund_time, update_time, ",
        "plat, plat_ext, return_url, callback_url, callback_status, callback_count, callback_time",
        "from `pay_consume_order`",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="account_id", property="accountId", jdbcType=JdbcType.VARCHAR),
        @Result(column="channel", property="channel", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.INTEGER),
        @Result(column="pay_time", property="payTime", jdbcType=JdbcType.INTEGER),
        @Result(column="recharge_id", property="rechargeId", jdbcType=JdbcType.VARCHAR),
        @Result(column="consume_amount", property="consumeAmount", jdbcType=JdbcType.INTEGER),
        @Result(column="recharge_amount", property="rechargeAmount", jdbcType=JdbcType.INTEGER),
        @Result(column="subject", property="subject", jdbcType=JdbcType.VARCHAR),
        @Result(column="body", property="body", jdbcType=JdbcType.VARCHAR),
        @Result(column="busi_consume_no", property="busiConsumeNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="busi_show_url", property="busiShowUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="city_id", property="cityId", jdbcType=JdbcType.INTEGER),
        @Result(column="refund_count", property="refundCount", jdbcType=JdbcType.INTEGER),
        @Result(column="expire_time", property="expireTime", jdbcType=JdbcType.INTEGER),
        @Result(column="refund_amount", property="refundAmount", jdbcType=JdbcType.INTEGER),
        @Result(column="refund_time", property="refundTime", jdbcType=JdbcType.INTEGER),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.INTEGER),
        @Result(column="plat", property="plat", jdbcType=JdbcType.INTEGER),
        @Result(column="plat_ext", property="platExt", jdbcType=JdbcType.VARCHAR),
        @Result(column="return_url", property="returnUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="callback_url", property="callbackUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="callback_status", property="callbackStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="callback_count", property="callbackCount", jdbcType=JdbcType.INTEGER),
        @Result(column="callback_time", property="callbackTime", jdbcType=JdbcType.INTEGER)
    })
    PayConsumeOrder selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_consume_order`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=PayConsumeOrderSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") PayConsumeOrder record, @Param("example") PayConsumeOrderCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_consume_order`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=PayConsumeOrderSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") PayConsumeOrder record, @Param("example") PayConsumeOrderCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_consume_order`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=PayConsumeOrderSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PayConsumeOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_consume_order`
     *
     * @mbggenerated
     */
    @Update({
        "update `pay_consume_order`",
        "set user_id = #{userId,jdbcType=VARCHAR},",
          "account_id = #{accountId,jdbcType=VARCHAR},",
          "channel = #{channel,jdbcType=INTEGER},",
          "status = #{status,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=INTEGER},",
          "pay_time = #{payTime,jdbcType=INTEGER},",
          "recharge_id = #{rechargeId,jdbcType=VARCHAR},",
          "consume_amount = #{consumeAmount,jdbcType=INTEGER},",
          "recharge_amount = #{rechargeAmount,jdbcType=INTEGER},",
          "subject = #{subject,jdbcType=VARCHAR},",
          "body = #{body,jdbcType=VARCHAR},",
          "busi_consume_no = #{busiConsumeNo,jdbcType=VARCHAR},",
          "busi_show_url = #{busiShowUrl,jdbcType=VARCHAR},",
          "city_id = #{cityId,jdbcType=INTEGER},",
          "refund_count = #{refundCount,jdbcType=INTEGER},",
          "expire_time = #{expireTime,jdbcType=INTEGER},",
          "refund_amount = #{refundAmount,jdbcType=INTEGER},",
          "refund_time = #{refundTime,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=INTEGER},",
          "plat = #{plat,jdbcType=INTEGER},",
          "plat_ext = #{platExt,jdbcType=VARCHAR},",
          "return_url = #{returnUrl,jdbcType=VARCHAR},",
          "callback_url = #{callbackUrl,jdbcType=VARCHAR},",
          "callback_status = #{callbackStatus,jdbcType=INTEGER},",
          "callback_count = #{callbackCount,jdbcType=INTEGER},",
          "callback_time = #{callbackTime,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(PayConsumeOrder record);
}