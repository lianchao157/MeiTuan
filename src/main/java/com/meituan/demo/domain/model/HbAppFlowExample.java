package com.meituan.demo.domain.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HbAppFlowExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hb_app_flow
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hb_app_flow
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hb_app_flow
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hb_app_flow
     *
     * @mbg.generated
     */
    public HbAppFlowExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hb_app_flow
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hb_app_flow
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hb_app_flow
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hb_app_flow
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hb_app_flow
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hb_app_flow
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hb_app_flow
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hb_app_flow
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hb_app_flow
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hb_app_flow
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hb_app_flow
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAppidIsNull() {
            addCriterion("appid is null");
            return (Criteria) this;
        }

        public Criteria andAppidIsNotNull() {
            addCriterion("appid is not null");
            return (Criteria) this;
        }

        public Criteria andAppidEqualTo(String value) {
            addCriterion("appid =", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotEqualTo(String value) {
            addCriterion("appid <>", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThan(String value) {
            addCriterion("appid >", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThanOrEqualTo(String value) {
            addCriterion("appid >=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThan(String value) {
            addCriterion("appid <", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThanOrEqualTo(String value) {
            addCriterion("appid <=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLike(String value) {
            addCriterion("appid like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotLike(String value) {
            addCriterion("appid not like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidIn(List<String> values) {
            addCriterion("appid in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotIn(List<String> values) {
            addCriterion("appid not in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidBetween(String value1, String value2) {
            addCriterion("appid between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotBetween(String value1, String value2) {
            addCriterion("appid not between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAuditidIsNull() {
            addCriterion("auditid is null");
            return (Criteria) this;
        }

        public Criteria andAuditidIsNotNull() {
            addCriterion("auditid is not null");
            return (Criteria) this;
        }

        public Criteria andAuditidEqualTo(String value) {
            addCriterion("auditid =", value, "auditid");
            return (Criteria) this;
        }

        public Criteria andAuditidNotEqualTo(String value) {
            addCriterion("auditid <>", value, "auditid");
            return (Criteria) this;
        }

        public Criteria andAuditidGreaterThan(String value) {
            addCriterion("auditid >", value, "auditid");
            return (Criteria) this;
        }

        public Criteria andAuditidGreaterThanOrEqualTo(String value) {
            addCriterion("auditid >=", value, "auditid");
            return (Criteria) this;
        }

        public Criteria andAuditidLessThan(String value) {
            addCriterion("auditid <", value, "auditid");
            return (Criteria) this;
        }

        public Criteria andAuditidLessThanOrEqualTo(String value) {
            addCriterion("auditid <=", value, "auditid");
            return (Criteria) this;
        }

        public Criteria andAuditidLike(String value) {
            addCriterion("auditid like", value, "auditid");
            return (Criteria) this;
        }

        public Criteria andAuditidNotLike(String value) {
            addCriterion("auditid not like", value, "auditid");
            return (Criteria) this;
        }

        public Criteria andAuditidIn(List<String> values) {
            addCriterion("auditid in", values, "auditid");
            return (Criteria) this;
        }

        public Criteria andAuditidNotIn(List<String> values) {
            addCriterion("auditid not in", values, "auditid");
            return (Criteria) this;
        }

        public Criteria andAuditidBetween(String value1, String value2) {
            addCriterion("auditid between", value1, value2, "auditid");
            return (Criteria) this;
        }

        public Criteria andAuditidNotBetween(String value1, String value2) {
            addCriterion("auditid not between", value1, value2, "auditid");
            return (Criteria) this;
        }

        public Criteria andAuditnameIsNull() {
            addCriterion("auditname is null");
            return (Criteria) this;
        }

        public Criteria andAuditnameIsNotNull() {
            addCriterion("auditname is not null");
            return (Criteria) this;
        }

        public Criteria andAuditnameEqualTo(String value) {
            addCriterion("auditname =", value, "auditname");
            return (Criteria) this;
        }

        public Criteria andAuditnameNotEqualTo(String value) {
            addCriterion("auditname <>", value, "auditname");
            return (Criteria) this;
        }

        public Criteria andAuditnameGreaterThan(String value) {
            addCriterion("auditname >", value, "auditname");
            return (Criteria) this;
        }

        public Criteria andAuditnameGreaterThanOrEqualTo(String value) {
            addCriterion("auditname >=", value, "auditname");
            return (Criteria) this;
        }

        public Criteria andAuditnameLessThan(String value) {
            addCriterion("auditname <", value, "auditname");
            return (Criteria) this;
        }

        public Criteria andAuditnameLessThanOrEqualTo(String value) {
            addCriterion("auditname <=", value, "auditname");
            return (Criteria) this;
        }

        public Criteria andAuditnameLike(String value) {
            addCriterion("auditname like", value, "auditname");
            return (Criteria) this;
        }

        public Criteria andAuditnameNotLike(String value) {
            addCriterion("auditname not like", value, "auditname");
            return (Criteria) this;
        }

        public Criteria andAuditnameIn(List<String> values) {
            addCriterion("auditname in", values, "auditname");
            return (Criteria) this;
        }

        public Criteria andAuditnameNotIn(List<String> values) {
            addCriterion("auditname not in", values, "auditname");
            return (Criteria) this;
        }

        public Criteria andAuditnameBetween(String value1, String value2) {
            addCriterion("auditname between", value1, value2, "auditname");
            return (Criteria) this;
        }

        public Criteria andAuditnameNotBetween(String value1, String value2) {
            addCriterion("auditname not between", value1, value2, "auditname");
            return (Criteria) this;
        }

        public Criteria andAuditstateIsNull() {
            addCriterion("auditstate is null");
            return (Criteria) this;
        }

        public Criteria andAuditstateIsNotNull() {
            addCriterion("auditstate is not null");
            return (Criteria) this;
        }

        public Criteria andAuditstateEqualTo(String value) {
            addCriterion("auditstate =", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateNotEqualTo(String value) {
            addCriterion("auditstate <>", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateGreaterThan(String value) {
            addCriterion("auditstate >", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateGreaterThanOrEqualTo(String value) {
            addCriterion("auditstate >=", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateLessThan(String value) {
            addCriterion("auditstate <", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateLessThanOrEqualTo(String value) {
            addCriterion("auditstate <=", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateLike(String value) {
            addCriterion("auditstate like", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateNotLike(String value) {
            addCriterion("auditstate not like", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateIn(List<String> values) {
            addCriterion("auditstate in", values, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateNotIn(List<String> values) {
            addCriterion("auditstate not in", values, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateBetween(String value1, String value2) {
            addCriterion("auditstate between", value1, value2, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateNotBetween(String value1, String value2) {
            addCriterion("auditstate not between", value1, value2, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAudittimeIsNull() {
            addCriterion("audittime is null");
            return (Criteria) this;
        }

        public Criteria andAudittimeIsNotNull() {
            addCriterion("audittime is not null");
            return (Criteria) this;
        }

        public Criteria andAudittimeEqualTo(Date value) {
            addCriterion("audittime =", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeNotEqualTo(Date value) {
            addCriterion("audittime <>", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeGreaterThan(Date value) {
            addCriterion("audittime >", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audittime >=", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeLessThan(Date value) {
            addCriterion("audittime <", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeLessThanOrEqualTo(Date value) {
            addCriterion("audittime <=", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeIn(List<Date> values) {
            addCriterion("audittime in", values, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeNotIn(List<Date> values) {
            addCriterion("audittime not in", values, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeBetween(Date value1, Date value2) {
            addCriterion("audittime between", value1, value2, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeNotBetween(Date value1, Date value2) {
            addCriterion("audittime not between", value1, value2, "audittime");
            return (Criteria) this;
        }

        public Criteria andAuditcomIsNull() {
            addCriterion("auditcom is null");
            return (Criteria) this;
        }

        public Criteria andAuditcomIsNotNull() {
            addCriterion("auditcom is not null");
            return (Criteria) this;
        }

        public Criteria andAuditcomEqualTo(String value) {
            addCriterion("auditcom =", value, "auditcom");
            return (Criteria) this;
        }

        public Criteria andAuditcomNotEqualTo(String value) {
            addCriterion("auditcom <>", value, "auditcom");
            return (Criteria) this;
        }

        public Criteria andAuditcomGreaterThan(String value) {
            addCriterion("auditcom >", value, "auditcom");
            return (Criteria) this;
        }

        public Criteria andAuditcomGreaterThanOrEqualTo(String value) {
            addCriterion("auditcom >=", value, "auditcom");
            return (Criteria) this;
        }

        public Criteria andAuditcomLessThan(String value) {
            addCriterion("auditcom <", value, "auditcom");
            return (Criteria) this;
        }

        public Criteria andAuditcomLessThanOrEqualTo(String value) {
            addCriterion("auditcom <=", value, "auditcom");
            return (Criteria) this;
        }

        public Criteria andAuditcomLike(String value) {
            addCriterion("auditcom like", value, "auditcom");
            return (Criteria) this;
        }

        public Criteria andAuditcomNotLike(String value) {
            addCriterion("auditcom not like", value, "auditcom");
            return (Criteria) this;
        }

        public Criteria andAuditcomIn(List<String> values) {
            addCriterion("auditcom in", values, "auditcom");
            return (Criteria) this;
        }

        public Criteria andAuditcomNotIn(List<String> values) {
            addCriterion("auditcom not in", values, "auditcom");
            return (Criteria) this;
        }

        public Criteria andAuditcomBetween(String value1, String value2) {
            addCriterion("auditcom between", value1, value2, "auditcom");
            return (Criteria) this;
        }

        public Criteria andAuditcomNotBetween(String value1, String value2) {
            addCriterion("auditcom not between", value1, value2, "auditcom");
            return (Criteria) this;
        }

        public Criteria andAuditnoIsNull() {
            addCriterion("auditno is null");
            return (Criteria) this;
        }

        public Criteria andAuditnoIsNotNull() {
            addCriterion("auditno is not null");
            return (Criteria) this;
        }

        public Criteria andAuditnoEqualTo(String value) {
            addCriterion("auditno =", value, "auditno");
            return (Criteria) this;
        }

        public Criteria andAuditnoNotEqualTo(String value) {
            addCriterion("auditno <>", value, "auditno");
            return (Criteria) this;
        }

        public Criteria andAuditnoGreaterThan(String value) {
            addCriterion("auditno >", value, "auditno");
            return (Criteria) this;
        }

        public Criteria andAuditnoGreaterThanOrEqualTo(String value) {
            addCriterion("auditno >=", value, "auditno");
            return (Criteria) this;
        }

        public Criteria andAuditnoLessThan(String value) {
            addCriterion("auditno <", value, "auditno");
            return (Criteria) this;
        }

        public Criteria andAuditnoLessThanOrEqualTo(String value) {
            addCriterion("auditno <=", value, "auditno");
            return (Criteria) this;
        }

        public Criteria andAuditnoLike(String value) {
            addCriterion("auditno like", value, "auditno");
            return (Criteria) this;
        }

        public Criteria andAuditnoNotLike(String value) {
            addCriterion("auditno not like", value, "auditno");
            return (Criteria) this;
        }

        public Criteria andAuditnoIn(List<String> values) {
            addCriterion("auditno in", values, "auditno");
            return (Criteria) this;
        }

        public Criteria andAuditnoNotIn(List<String> values) {
            addCriterion("auditno not in", values, "auditno");
            return (Criteria) this;
        }

        public Criteria andAuditnoBetween(String value1, String value2) {
            addCriterion("auditno between", value1, value2, "auditno");
            return (Criteria) this;
        }

        public Criteria andAuditnoNotBetween(String value1, String value2) {
            addCriterion("auditno not between", value1, value2, "auditno");
            return (Criteria) this;
        }

        public Criteria andReseerved1IsNull() {
            addCriterion("reseerved1 is null");
            return (Criteria) this;
        }

        public Criteria andReseerved1IsNotNull() {
            addCriterion("reseerved1 is not null");
            return (Criteria) this;
        }

        public Criteria andReseerved1EqualTo(String value) {
            addCriterion("reseerved1 =", value, "reseerved1");
            return (Criteria) this;
        }

        public Criteria andReseerved1NotEqualTo(String value) {
            addCriterion("reseerved1 <>", value, "reseerved1");
            return (Criteria) this;
        }

        public Criteria andReseerved1GreaterThan(String value) {
            addCriterion("reseerved1 >", value, "reseerved1");
            return (Criteria) this;
        }

        public Criteria andReseerved1GreaterThanOrEqualTo(String value) {
            addCriterion("reseerved1 >=", value, "reseerved1");
            return (Criteria) this;
        }

        public Criteria andReseerved1LessThan(String value) {
            addCriterion("reseerved1 <", value, "reseerved1");
            return (Criteria) this;
        }

        public Criteria andReseerved1LessThanOrEqualTo(String value) {
            addCriterion("reseerved1 <=", value, "reseerved1");
            return (Criteria) this;
        }

        public Criteria andReseerved1Like(String value) {
            addCriterion("reseerved1 like", value, "reseerved1");
            return (Criteria) this;
        }

        public Criteria andReseerved1NotLike(String value) {
            addCriterion("reseerved1 not like", value, "reseerved1");
            return (Criteria) this;
        }

        public Criteria andReseerved1In(List<String> values) {
            addCriterion("reseerved1 in", values, "reseerved1");
            return (Criteria) this;
        }

        public Criteria andReseerved1NotIn(List<String> values) {
            addCriterion("reseerved1 not in", values, "reseerved1");
            return (Criteria) this;
        }

        public Criteria andReseerved1Between(String value1, String value2) {
            addCriterion("reseerved1 between", value1, value2, "reseerved1");
            return (Criteria) this;
        }

        public Criteria andReseerved1NotBetween(String value1, String value2) {
            addCriterion("reseerved1 not between", value1, value2, "reseerved1");
            return (Criteria) this;
        }

        public Criteria andReseerved2IsNull() {
            addCriterion("reseerved2 is null");
            return (Criteria) this;
        }

        public Criteria andReseerved2IsNotNull() {
            addCriterion("reseerved2 is not null");
            return (Criteria) this;
        }

        public Criteria andReseerved2EqualTo(String value) {
            addCriterion("reseerved2 =", value, "reseerved2");
            return (Criteria) this;
        }

        public Criteria andReseerved2NotEqualTo(String value) {
            addCriterion("reseerved2 <>", value, "reseerved2");
            return (Criteria) this;
        }

        public Criteria andReseerved2GreaterThan(String value) {
            addCriterion("reseerved2 >", value, "reseerved2");
            return (Criteria) this;
        }

        public Criteria andReseerved2GreaterThanOrEqualTo(String value) {
            addCriterion("reseerved2 >=", value, "reseerved2");
            return (Criteria) this;
        }

        public Criteria andReseerved2LessThan(String value) {
            addCriterion("reseerved2 <", value, "reseerved2");
            return (Criteria) this;
        }

        public Criteria andReseerved2LessThanOrEqualTo(String value) {
            addCriterion("reseerved2 <=", value, "reseerved2");
            return (Criteria) this;
        }

        public Criteria andReseerved2Like(String value) {
            addCriterion("reseerved2 like", value, "reseerved2");
            return (Criteria) this;
        }

        public Criteria andReseerved2NotLike(String value) {
            addCriterion("reseerved2 not like", value, "reseerved2");
            return (Criteria) this;
        }

        public Criteria andReseerved2In(List<String> values) {
            addCriterion("reseerved2 in", values, "reseerved2");
            return (Criteria) this;
        }

        public Criteria andReseerved2NotIn(List<String> values) {
            addCriterion("reseerved2 not in", values, "reseerved2");
            return (Criteria) this;
        }

        public Criteria andReseerved2Between(String value1, String value2) {
            addCriterion("reseerved2 between", value1, value2, "reseerved2");
            return (Criteria) this;
        }

        public Criteria andReseerved2NotBetween(String value1, String value2) {
            addCriterion("reseerved2 not between", value1, value2, "reseerved2");
            return (Criteria) this;
        }

        public Criteria andReseerved3IsNull() {
            addCriterion("reseerved3 is null");
            return (Criteria) this;
        }

        public Criteria andReseerved3IsNotNull() {
            addCriterion("reseerved3 is not null");
            return (Criteria) this;
        }

        public Criteria andReseerved3EqualTo(String value) {
            addCriterion("reseerved3 =", value, "reseerved3");
            return (Criteria) this;
        }

        public Criteria andReseerved3NotEqualTo(String value) {
            addCriterion("reseerved3 <>", value, "reseerved3");
            return (Criteria) this;
        }

        public Criteria andReseerved3GreaterThan(String value) {
            addCriterion("reseerved3 >", value, "reseerved3");
            return (Criteria) this;
        }

        public Criteria andReseerved3GreaterThanOrEqualTo(String value) {
            addCriterion("reseerved3 >=", value, "reseerved3");
            return (Criteria) this;
        }

        public Criteria andReseerved3LessThan(String value) {
            addCriterion("reseerved3 <", value, "reseerved3");
            return (Criteria) this;
        }

        public Criteria andReseerved3LessThanOrEqualTo(String value) {
            addCriterion("reseerved3 <=", value, "reseerved3");
            return (Criteria) this;
        }

        public Criteria andReseerved3Like(String value) {
            addCriterion("reseerved3 like", value, "reseerved3");
            return (Criteria) this;
        }

        public Criteria andReseerved3NotLike(String value) {
            addCriterion("reseerved3 not like", value, "reseerved3");
            return (Criteria) this;
        }

        public Criteria andReseerved3In(List<String> values) {
            addCriterion("reseerved3 in", values, "reseerved3");
            return (Criteria) this;
        }

        public Criteria andReseerved3NotIn(List<String> values) {
            addCriterion("reseerved3 not in", values, "reseerved3");
            return (Criteria) this;
        }

        public Criteria andReseerved3Between(String value1, String value2) {
            addCriterion("reseerved3 between", value1, value2, "reseerved3");
            return (Criteria) this;
        }

        public Criteria andReseerved3NotBetween(String value1, String value2) {
            addCriterion("reseerved3 not between", value1, value2, "reseerved3");
            return (Criteria) this;
        }

        public Criteria andReseerved4IsNull() {
            addCriterion("reseerved4 is null");
            return (Criteria) this;
        }

        public Criteria andReseerved4IsNotNull() {
            addCriterion("reseerved4 is not null");
            return (Criteria) this;
        }

        public Criteria andReseerved4EqualTo(String value) {
            addCriterion("reseerved4 =", value, "reseerved4");
            return (Criteria) this;
        }

        public Criteria andReseerved4NotEqualTo(String value) {
            addCriterion("reseerved4 <>", value, "reseerved4");
            return (Criteria) this;
        }

        public Criteria andReseerved4GreaterThan(String value) {
            addCriterion("reseerved4 >", value, "reseerved4");
            return (Criteria) this;
        }

        public Criteria andReseerved4GreaterThanOrEqualTo(String value) {
            addCriterion("reseerved4 >=", value, "reseerved4");
            return (Criteria) this;
        }

        public Criteria andReseerved4LessThan(String value) {
            addCriterion("reseerved4 <", value, "reseerved4");
            return (Criteria) this;
        }

        public Criteria andReseerved4LessThanOrEqualTo(String value) {
            addCriterion("reseerved4 <=", value, "reseerved4");
            return (Criteria) this;
        }

        public Criteria andReseerved4Like(String value) {
            addCriterion("reseerved4 like", value, "reseerved4");
            return (Criteria) this;
        }

        public Criteria andReseerved4NotLike(String value) {
            addCriterion("reseerved4 not like", value, "reseerved4");
            return (Criteria) this;
        }

        public Criteria andReseerved4In(List<String> values) {
            addCriterion("reseerved4 in", values, "reseerved4");
            return (Criteria) this;
        }

        public Criteria andReseerved4NotIn(List<String> values) {
            addCriterion("reseerved4 not in", values, "reseerved4");
            return (Criteria) this;
        }

        public Criteria andReseerved4Between(String value1, String value2) {
            addCriterion("reseerved4 between", value1, value2, "reseerved4");
            return (Criteria) this;
        }

        public Criteria andReseerved4NotBetween(String value1, String value2) {
            addCriterion("reseerved4 not between", value1, value2, "reseerved4");
            return (Criteria) this;
        }

        public Criteria andReseerved5IsNull() {
            addCriterion("reseerved5 is null");
            return (Criteria) this;
        }

        public Criteria andReseerved5IsNotNull() {
            addCriterion("reseerved5 is not null");
            return (Criteria) this;
        }

        public Criteria andReseerved5EqualTo(String value) {
            addCriterion("reseerved5 =", value, "reseerved5");
            return (Criteria) this;
        }

        public Criteria andReseerved5NotEqualTo(String value) {
            addCriterion("reseerved5 <>", value, "reseerved5");
            return (Criteria) this;
        }

        public Criteria andReseerved5GreaterThan(String value) {
            addCriterion("reseerved5 >", value, "reseerved5");
            return (Criteria) this;
        }

        public Criteria andReseerved5GreaterThanOrEqualTo(String value) {
            addCriterion("reseerved5 >=", value, "reseerved5");
            return (Criteria) this;
        }

        public Criteria andReseerved5LessThan(String value) {
            addCriterion("reseerved5 <", value, "reseerved5");
            return (Criteria) this;
        }

        public Criteria andReseerved5LessThanOrEqualTo(String value) {
            addCriterion("reseerved5 <=", value, "reseerved5");
            return (Criteria) this;
        }

        public Criteria andReseerved5Like(String value) {
            addCriterion("reseerved5 like", value, "reseerved5");
            return (Criteria) this;
        }

        public Criteria andReseerved5NotLike(String value) {
            addCriterion("reseerved5 not like", value, "reseerved5");
            return (Criteria) this;
        }

        public Criteria andReseerved5In(List<String> values) {
            addCriterion("reseerved5 in", values, "reseerved5");
            return (Criteria) this;
        }

        public Criteria andReseerved5NotIn(List<String> values) {
            addCriterion("reseerved5 not in", values, "reseerved5");
            return (Criteria) this;
        }

        public Criteria andReseerved5Between(String value1, String value2) {
            addCriterion("reseerved5 between", value1, value2, "reseerved5");
            return (Criteria) this;
        }

        public Criteria andReseerved5NotBetween(String value1, String value2) {
            addCriterion("reseerved5 not between", value1, value2, "reseerved5");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hb_app_flow
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hb_app_flow
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}