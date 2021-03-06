package com.hbc.data.trade.transfer.mapping.hbcfund.gen;

import com.hbc.data.trade.transfer.mapping.hbcfund.gen.bean.FinalGuidedraw;
import com.hbc.data.trade.transfer.mapping.hbcfund.gen.bean.FinalGuidedrawCriteria;
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

public interface FinalGuidedrawMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guidedraw`
     *
     * @mbggenerated
     */
    @SelectProvider(type=FinalGuidedrawSqlProvider.class, method="countByExample")
    int countByExample(FinalGuidedrawCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guidedraw`
     *
     * @mbggenerated
     */
    @DeleteProvider(type=FinalGuidedrawSqlProvider.class, method="deleteByExample")
    int deleteByExample(FinalGuidedrawCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guidedraw`
     *
     * @mbggenerated
     */
    @Delete({
        "delete from `guidedraw`",
        "where guideDrawId = #{guidedrawid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer guidedrawid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guidedraw`
     *
     * @mbggenerated
     */
    @Insert({
        "insert into `guidedraw` (guideDrawId, guideDrawNo, ",
        "guideId, guideNo, ",
        "guideName, applyTime, ",
        "price, finName, ",
        "finAccount, finBank, ",
        "finCurrency, finType, ",
        "adminId, transferTime, ",
        "actualPrice, account, ",
        "comment, status, ",
        "is_auto, updated_at, ",
        "created_at)",
        "values (#{guidedrawid,jdbcType=INTEGER}, #{guidedrawno,jdbcType=VARCHAR}, ",
        "#{guideid,jdbcType=INTEGER}, #{guideno,jdbcType=VARCHAR}, ",
        "#{guidename,jdbcType=VARCHAR}, #{applytime,jdbcType=TIMESTAMP}, ",
        "#{price,jdbcType=INTEGER}, #{finname,jdbcType=VARCHAR}, ",
        "#{finaccount,jdbcType=VARCHAR}, #{finbank,jdbcType=VARCHAR}, ",
        "#{fincurrency,jdbcType=VARCHAR}, #{fintype,jdbcType=INTEGER}, ",
        "#{adminid,jdbcType=INTEGER}, #{transfertime,jdbcType=TIMESTAMP}, ",
        "#{actualprice,jdbcType=INTEGER}, #{account,jdbcType=VARCHAR}, ",
        "#{comment,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER}, ",
        "#{isAuto,jdbcType=OTHER}, #{updatedAt,jdbcType=TIMESTAMP}, ",
        "#{createdAt,jdbcType=TIMESTAMP})"
    })
    int insert(FinalGuidedraw record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guidedraw`
     *
     * @mbggenerated
     */
    @InsertProvider(type=FinalGuidedrawSqlProvider.class, method="insertSelective")
    int insertSelective(FinalGuidedraw record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guidedraw`
     *
     * @mbggenerated
     */
    @SelectProvider(type=FinalGuidedrawSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="guideDrawId", property="guidedrawid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="guideDrawNo", property="guidedrawno", jdbcType=JdbcType.VARCHAR),
        @Result(column="guideId", property="guideid", jdbcType=JdbcType.INTEGER),
        @Result(column="guideNo", property="guideno", jdbcType=JdbcType.VARCHAR),
        @Result(column="guideName", property="guidename", jdbcType=JdbcType.VARCHAR),
        @Result(column="applyTime", property="applytime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="price", property="price", jdbcType=JdbcType.INTEGER),
        @Result(column="finName", property="finname", jdbcType=JdbcType.VARCHAR),
        @Result(column="finAccount", property="finaccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="finBank", property="finbank", jdbcType=JdbcType.VARCHAR),
        @Result(column="finCurrency", property="fincurrency", jdbcType=JdbcType.VARCHAR),
        @Result(column="finType", property="fintype", jdbcType=JdbcType.INTEGER),
        @Result(column="adminId", property="adminid", jdbcType=JdbcType.INTEGER),
        @Result(column="transferTime", property="transfertime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="actualPrice", property="actualprice", jdbcType=JdbcType.INTEGER),
        @Result(column="account", property="account", jdbcType=JdbcType.VARCHAR),
        @Result(column="comment", property="comment", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="is_auto", property="isAuto", jdbcType=JdbcType.OTHER),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<FinalGuidedraw> selectByExampleWithRowbounds(FinalGuidedrawCriteria example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guidedraw`
     *
     * @mbggenerated
     */
    @SelectProvider(type=FinalGuidedrawSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="guideDrawId", property="guidedrawid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="guideDrawNo", property="guidedrawno", jdbcType=JdbcType.VARCHAR),
        @Result(column="guideId", property="guideid", jdbcType=JdbcType.INTEGER),
        @Result(column="guideNo", property="guideno", jdbcType=JdbcType.VARCHAR),
        @Result(column="guideName", property="guidename", jdbcType=JdbcType.VARCHAR),
        @Result(column="applyTime", property="applytime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="price", property="price", jdbcType=JdbcType.INTEGER),
        @Result(column="finName", property="finname", jdbcType=JdbcType.VARCHAR),
        @Result(column="finAccount", property="finaccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="finBank", property="finbank", jdbcType=JdbcType.VARCHAR),
        @Result(column="finCurrency", property="fincurrency", jdbcType=JdbcType.VARCHAR),
        @Result(column="finType", property="fintype", jdbcType=JdbcType.INTEGER),
        @Result(column="adminId", property="adminid", jdbcType=JdbcType.INTEGER),
        @Result(column="transferTime", property="transfertime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="actualPrice", property="actualprice", jdbcType=JdbcType.INTEGER),
        @Result(column="account", property="account", jdbcType=JdbcType.VARCHAR),
        @Result(column="comment", property="comment", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="is_auto", property="isAuto", jdbcType=JdbcType.OTHER),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<FinalGuidedraw> selectByExample(FinalGuidedrawCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guidedraw`
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "guideDrawId, guideDrawNo, guideId, guideNo, guideName, applyTime, price, finName, ",
        "finAccount, finBank, finCurrency, finType, adminId, transferTime, actualPrice, ",
        "account, comment, status, is_auto, updated_at, created_at",
        "from `guidedraw`",
        "where guideDrawId = #{guidedrawid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="guideDrawId", property="guidedrawid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="guideDrawNo", property="guidedrawno", jdbcType=JdbcType.VARCHAR),
        @Result(column="guideId", property="guideid", jdbcType=JdbcType.INTEGER),
        @Result(column="guideNo", property="guideno", jdbcType=JdbcType.VARCHAR),
        @Result(column="guideName", property="guidename", jdbcType=JdbcType.VARCHAR),
        @Result(column="applyTime", property="applytime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="price", property="price", jdbcType=JdbcType.INTEGER),
        @Result(column="finName", property="finname", jdbcType=JdbcType.VARCHAR),
        @Result(column="finAccount", property="finaccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="finBank", property="finbank", jdbcType=JdbcType.VARCHAR),
        @Result(column="finCurrency", property="fincurrency", jdbcType=JdbcType.VARCHAR),
        @Result(column="finType", property="fintype", jdbcType=JdbcType.INTEGER),
        @Result(column="adminId", property="adminid", jdbcType=JdbcType.INTEGER),
        @Result(column="transferTime", property="transfertime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="actualPrice", property="actualprice", jdbcType=JdbcType.INTEGER),
        @Result(column="account", property="account", jdbcType=JdbcType.VARCHAR),
        @Result(column="comment", property="comment", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="is_auto", property="isAuto", jdbcType=JdbcType.OTHER),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    FinalGuidedraw selectByPrimaryKey(Integer guidedrawid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guidedraw`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=FinalGuidedrawSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FinalGuidedraw record, @Param("example") FinalGuidedrawCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guidedraw`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=FinalGuidedrawSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FinalGuidedraw record, @Param("example") FinalGuidedrawCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guidedraw`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=FinalGuidedrawSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FinalGuidedraw record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guidedraw`
     *
     * @mbggenerated
     */
    @Update({
        "update `guidedraw`",
        "set guideDrawNo = #{guidedrawno,jdbcType=VARCHAR},",
          "guideId = #{guideid,jdbcType=INTEGER},",
          "guideNo = #{guideno,jdbcType=VARCHAR},",
          "guideName = #{guidename,jdbcType=VARCHAR},",
          "applyTime = #{applytime,jdbcType=TIMESTAMP},",
          "price = #{price,jdbcType=INTEGER},",
          "finName = #{finname,jdbcType=VARCHAR},",
          "finAccount = #{finaccount,jdbcType=VARCHAR},",
          "finBank = #{finbank,jdbcType=VARCHAR},",
          "finCurrency = #{fincurrency,jdbcType=VARCHAR},",
          "finType = #{fintype,jdbcType=INTEGER},",
          "adminId = #{adminid,jdbcType=INTEGER},",
          "transferTime = #{transfertime,jdbcType=TIMESTAMP},",
          "actualPrice = #{actualprice,jdbcType=INTEGER},",
          "account = #{account,jdbcType=VARCHAR},",
          "comment = #{comment,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER},",
          "is_auto = #{isAuto,jdbcType=OTHER},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP}",
        "where guideDrawId = #{guidedrawid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FinalGuidedraw record);
}