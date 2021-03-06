package com.hbc.api.trade.order.mapping.gen;

import com.hbc.api.trade.order.mapping.gen.bean.TradeDeliverGuide;
import com.hbc.api.trade.order.mapping.gen.bean.TradeDeliverGuideExample.Criteria;
import com.hbc.api.trade.order.mapping.gen.bean.TradeDeliverGuideExample.Criterion;
import com.hbc.api.trade.order.mapping.gen.bean.TradeDeliverGuideExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TradeDeliverGuideSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_deliver_guide`
     *
     * @mbggenerated
     */
    public String countByExample(TradeDeliverGuideExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("`trade_deliver_guide`");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_deliver_guide`
     *
     * @mbggenerated
     */
    public String deleteByExample(TradeDeliverGuideExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("`trade_deliver_guide`");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_deliver_guide`
     *
     * @mbggenerated
     */
    public String insertSelective(TradeDeliverGuide record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("`trade_deliver_guide`");
        
        if (record.getAllocatGno() != null) {
            sql.VALUES("allocat_gno", "#{allocatGno,jdbcType=VARCHAR}");
        }
        
        if (record.getDeliverNo() != null) {
            sql.VALUES("deliver_no", "#{deliverNo,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderNo() != null) {
            sql.VALUES("order_no", "#{orderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getGuideId() != null) {
            sql.VALUES("guide_id", "#{guideId,jdbcType=VARCHAR}");
        }
        
        if (record.getGuideName() != null) {
            sql.VALUES("guide_name", "#{guideName,jdbcType=VARCHAR}");
        }
        
        if (record.getGuidePrice() != null) {
            sql.VALUES("guide_price", "#{guidePrice,jdbcType=DOUBLE}");
        }
        
        if (record.getGuideNo() != null) {
            sql.VALUES("guide_no", "#{guideNo,jdbcType=VARCHAR}");
        }
        
        if (record.getDeliverType() != null) {
            sql.VALUES("deliver_type", "#{deliverType,jdbcType=INTEGER}");
        }
        
        if (record.getDeliverTypeName() != null) {
            sql.VALUES("deliver_type_name", "#{deliverTypeName,jdbcType=VARCHAR}");
        }
        
        if (record.getDeliverStatus() != null) {
            sql.VALUES("deliver_status", "#{deliverStatus,jdbcType=INTEGER}");
        }
        
        if (record.getDeliverStatusName() != null) {
            sql.VALUES("deliver_status_name", "#{deliverStatusName,jdbcType=VARCHAR}");
        }
        
        if (record.getDemandDeal() != null) {
            sql.VALUES("demand_deal", "#{demandDeal,jdbcType=INTEGER}");
        }
        
        if (record.getIsRead() != null) {
            sql.VALUES("is_read", "#{isRead,jdbcType=INTEGER}");
        }
        
        if (record.getIsReadMis() != null) {
            sql.VALUES("is_read_mis", "#{isReadMis,jdbcType=INTEGER}");
        }
        
        if (record.getIsReadable() != null) {
            sql.VALUES("is_readable", "#{isReadable,jdbcType=INTEGER}");
        }
        
        if (record.getIsOnWay() != null) {
            sql.VALUES("is_on_way", "#{isOnWay,jdbcType=INTEGER}");
        }
        
        if (record.getFailType() != null) {
            sql.VALUES("fail_type", "#{failType,jdbcType=INTEGER}");
        }
        
        if (record.getViewResult() != null) {
            sql.VALUES("view_result", "#{viewResult,jdbcType=INTEGER}");
        }
        
        if (record.getRefuseReason() != null) {
            sql.VALUES("refuse_reason", "#{refuseReason,jdbcType=VARCHAR}");
        }
        
        if (record.getAcceptTime() != null) {
            sql.VALUES("accept_time", "#{acceptTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getFirstReadTime() != null) {
            sql.VALUES("first_read_time", "#{firstReadTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOther() != null) {
            sql.VALUES("other", "#{other,jdbcType=VARCHAR}");
        }
        
        if (record.getServiceTime() != null) {
            sql.VALUES("service_time", "#{serviceTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_deliver_guide`
     *
     * @mbggenerated
     */
    public String selectByExample(TradeDeliverGuideExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("allocat_gno");
        } else {
            sql.SELECT("allocat_gno");
        }
        sql.SELECT("deliver_no");
        sql.SELECT("order_no");
        sql.SELECT("guide_id");
        sql.SELECT("guide_name");
        sql.SELECT("guide_price");
        sql.SELECT("guide_no");
        sql.SELECT("deliver_type");
        sql.SELECT("deliver_type_name");
        sql.SELECT("deliver_status");
        sql.SELECT("deliver_status_name");
        sql.SELECT("demand_deal");
        sql.SELECT("is_read");
        sql.SELECT("is_read_mis");
        sql.SELECT("is_readable");
        sql.SELECT("is_on_way");
        sql.SELECT("fail_type");
        sql.SELECT("view_result");
        sql.SELECT("refuse_reason");
        sql.SELECT("accept_time");
        sql.SELECT("first_read_time");
        sql.SELECT("other");
        sql.SELECT("service_time");
        sql.SELECT("update_time");
        sql.SELECT("create_time");
        sql.FROM("`trade_deliver_guide`");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
         String sqlStr = sql.toString();
        if(example.getPage()!=null){
            sqlStr = sqlStr+" limit "+example.getPage().getOffset()+","+example.getPage().getLimit()+"";
             }
            return sqlStr;
        }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_deliver_guide`
     *
     * @mbggenerated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        TradeDeliverGuide record = (TradeDeliverGuide) parameter.get("record");
        TradeDeliverGuideExample example = (TradeDeliverGuideExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("`trade_deliver_guide`");
        
        if (record.getAllocatGno() != null) {
            sql.SET("allocat_gno = #{record.allocatGno,jdbcType=VARCHAR}");
        }
        
        if (record.getDeliverNo() != null) {
            sql.SET("deliver_no = #{record.deliverNo,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderNo() != null) {
            sql.SET("order_no = #{record.orderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getGuideId() != null) {
            sql.SET("guide_id = #{record.guideId,jdbcType=VARCHAR}");
        }
        
        if (record.getGuideName() != null) {
            sql.SET("guide_name = #{record.guideName,jdbcType=VARCHAR}");
        }
        
        if (record.getGuidePrice() != null) {
            sql.SET("guide_price = #{record.guidePrice,jdbcType=DOUBLE}");
        }
        
        if (record.getGuideNo() != null) {
            sql.SET("guide_no = #{record.guideNo,jdbcType=VARCHAR}");
        }
        
        if (record.getDeliverType() != null) {
            sql.SET("deliver_type = #{record.deliverType,jdbcType=INTEGER}");
        }
        
        if (record.getDeliverTypeName() != null) {
            sql.SET("deliver_type_name = #{record.deliverTypeName,jdbcType=VARCHAR}");
        }
        
        if (record.getDeliverStatus() != null) {
            sql.SET("deliver_status = #{record.deliverStatus,jdbcType=INTEGER}");
        }
        
        if (record.getDeliverStatusName() != null) {
            sql.SET("deliver_status_name = #{record.deliverStatusName,jdbcType=VARCHAR}");
        }
        
        if (record.getDemandDeal() != null) {
            sql.SET("demand_deal = #{record.demandDeal,jdbcType=INTEGER}");
        }
        
        if (record.getIsRead() != null) {
            sql.SET("is_read = #{record.isRead,jdbcType=INTEGER}");
        }
        
        if (record.getIsReadMis() != null) {
            sql.SET("is_read_mis = #{record.isReadMis,jdbcType=INTEGER}");
        }
        
        if (record.getIsReadable() != null) {
            sql.SET("is_readable = #{record.isReadable,jdbcType=INTEGER}");
        }
        
        if (record.getIsOnWay() != null) {
            sql.SET("is_on_way = #{record.isOnWay,jdbcType=INTEGER}");
        }
        
        if (record.getFailType() != null) {
            sql.SET("fail_type = #{record.failType,jdbcType=INTEGER}");
        }
        
        if (record.getViewResult() != null) {
            sql.SET("view_result = #{record.viewResult,jdbcType=INTEGER}");
        }
        
        if (record.getRefuseReason() != null) {
            sql.SET("refuse_reason = #{record.refuseReason,jdbcType=VARCHAR}");
        }
        
        if (record.getAcceptTime() != null) {
            sql.SET("accept_time = #{record.acceptTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getFirstReadTime() != null) {
            sql.SET("first_read_time = #{record.firstReadTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOther() != null) {
            sql.SET("other = #{record.other,jdbcType=VARCHAR}");
        }
        
        if (record.getServiceTime() != null) {
            sql.SET("service_time = #{record.serviceTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_deliver_guide`
     *
     * @mbggenerated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("`trade_deliver_guide`");
        
        sql.SET("allocat_gno = #{record.allocatGno,jdbcType=VARCHAR}");
        sql.SET("deliver_no = #{record.deliverNo,jdbcType=VARCHAR}");
        sql.SET("order_no = #{record.orderNo,jdbcType=VARCHAR}");
        sql.SET("guide_id = #{record.guideId,jdbcType=VARCHAR}");
        sql.SET("guide_name = #{record.guideName,jdbcType=VARCHAR}");
        sql.SET("guide_price = #{record.guidePrice,jdbcType=DOUBLE}");
        sql.SET("guide_no = #{record.guideNo,jdbcType=VARCHAR}");
        sql.SET("deliver_type = #{record.deliverType,jdbcType=INTEGER}");
        sql.SET("deliver_type_name = #{record.deliverTypeName,jdbcType=VARCHAR}");
        sql.SET("deliver_status = #{record.deliverStatus,jdbcType=INTEGER}");
        sql.SET("deliver_status_name = #{record.deliverStatusName,jdbcType=VARCHAR}");
        sql.SET("demand_deal = #{record.demandDeal,jdbcType=INTEGER}");
        sql.SET("is_read = #{record.isRead,jdbcType=INTEGER}");
        sql.SET("is_read_mis = #{record.isReadMis,jdbcType=INTEGER}");
        sql.SET("is_readable = #{record.isReadable,jdbcType=INTEGER}");
        sql.SET("is_on_way = #{record.isOnWay,jdbcType=INTEGER}");
        sql.SET("fail_type = #{record.failType,jdbcType=INTEGER}");
        sql.SET("view_result = #{record.viewResult,jdbcType=INTEGER}");
        sql.SET("refuse_reason = #{record.refuseReason,jdbcType=VARCHAR}");
        sql.SET("accept_time = #{record.acceptTime,jdbcType=TIMESTAMP}");
        sql.SET("first_read_time = #{record.firstReadTime,jdbcType=TIMESTAMP}");
        sql.SET("other = #{record.other,jdbcType=VARCHAR}");
        sql.SET("service_time = #{record.serviceTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        
        TradeDeliverGuideExample example = (TradeDeliverGuideExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_deliver_guide`
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(TradeDeliverGuide record) {
        SQL sql = new SQL();
        sql.UPDATE("`trade_deliver_guide`");
        
        if (record.getDeliverNo() != null) {
            sql.SET("deliver_no = #{deliverNo,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderNo() != null) {
            sql.SET("order_no = #{orderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getGuideId() != null) {
            sql.SET("guide_id = #{guideId,jdbcType=VARCHAR}");
        }
        
        if (record.getGuideName() != null) {
            sql.SET("guide_name = #{guideName,jdbcType=VARCHAR}");
        }
        
        if (record.getGuidePrice() != null) {
            sql.SET("guide_price = #{guidePrice,jdbcType=DOUBLE}");
        }
        
        if (record.getGuideNo() != null) {
            sql.SET("guide_no = #{guideNo,jdbcType=VARCHAR}");
        }
        
        if (record.getDeliverType() != null) {
            sql.SET("deliver_type = #{deliverType,jdbcType=INTEGER}");
        }
        
        if (record.getDeliverTypeName() != null) {
            sql.SET("deliver_type_name = #{deliverTypeName,jdbcType=VARCHAR}");
        }
        
        if (record.getDeliverStatus() != null) {
            sql.SET("deliver_status = #{deliverStatus,jdbcType=INTEGER}");
        }
        
        if (record.getDeliverStatusName() != null) {
            sql.SET("deliver_status_name = #{deliverStatusName,jdbcType=VARCHAR}");
        }
        
        if (record.getDemandDeal() != null) {
            sql.SET("demand_deal = #{demandDeal,jdbcType=INTEGER}");
        }
        
        if (record.getIsRead() != null) {
            sql.SET("is_read = #{isRead,jdbcType=INTEGER}");
        }
        
        if (record.getIsReadMis() != null) {
            sql.SET("is_read_mis = #{isReadMis,jdbcType=INTEGER}");
        }
        
        if (record.getIsReadable() != null) {
            sql.SET("is_readable = #{isReadable,jdbcType=INTEGER}");
        }
        
        if (record.getIsOnWay() != null) {
            sql.SET("is_on_way = #{isOnWay,jdbcType=INTEGER}");
        }
        
        if (record.getFailType() != null) {
            sql.SET("fail_type = #{failType,jdbcType=INTEGER}");
        }
        
        if (record.getViewResult() != null) {
            sql.SET("view_result = #{viewResult,jdbcType=INTEGER}");
        }
        
        if (record.getRefuseReason() != null) {
            sql.SET("refuse_reason = #{refuseReason,jdbcType=VARCHAR}");
        }
        
        if (record.getAcceptTime() != null) {
            sql.SET("accept_time = #{acceptTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getFirstReadTime() != null) {
            sql.SET("first_read_time = #{firstReadTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOther() != null) {
            sql.SET("other = #{other,jdbcType=VARCHAR}");
        }
        
        if (record.getServiceTime() != null) {
            sql.SET("service_time = #{serviceTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("allocat_gno = #{allocatGno,jdbcType=VARCHAR}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_deliver_guide`
     *
     * @mbggenerated
     */
    protected void applyWhere(SQL sql, TradeDeliverGuideExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}