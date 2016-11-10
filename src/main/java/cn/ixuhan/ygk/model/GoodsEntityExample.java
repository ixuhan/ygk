package cn.ixuhan.ygk.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GoodsEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public GoodsEntityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsDescIsNull() {
            addCriterion("goods_desc is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDescIsNotNull() {
            addCriterion("goods_desc is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDescEqualTo(String value) {
            addCriterion("goods_desc =", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescNotEqualTo(String value) {
            addCriterion("goods_desc <>", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescGreaterThan(String value) {
            addCriterion("goods_desc >", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescGreaterThanOrEqualTo(String value) {
            addCriterion("goods_desc >=", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescLessThan(String value) {
            addCriterion("goods_desc <", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescLessThanOrEqualTo(String value) {
            addCriterion("goods_desc <=", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescLike(String value) {
            addCriterion("goods_desc like", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescNotLike(String value) {
            addCriterion("goods_desc not like", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescIn(List<String> values) {
            addCriterion("goods_desc in", values, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescNotIn(List<String> values) {
            addCriterion("goods_desc not in", values, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescBetween(String value1, String value2) {
            addCriterion("goods_desc between", value1, value2, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescNotBetween(String value1, String value2) {
            addCriterion("goods_desc not between", value1, value2, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceOldIsNull() {
            addCriterion("goods_price_old is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceOldIsNotNull() {
            addCriterion("goods_price_old is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceOldEqualTo(Double value) {
            addCriterion("goods_price_old =", value, "goodsPriceOld");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceOldNotEqualTo(Double value) {
            addCriterion("goods_price_old <>", value, "goodsPriceOld");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceOldGreaterThan(Double value) {
            addCriterion("goods_price_old >", value, "goodsPriceOld");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceOldGreaterThanOrEqualTo(Double value) {
            addCriterion("goods_price_old >=", value, "goodsPriceOld");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceOldLessThan(Double value) {
            addCriterion("goods_price_old <", value, "goodsPriceOld");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceOldLessThanOrEqualTo(Double value) {
            addCriterion("goods_price_old <=", value, "goodsPriceOld");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceOldIn(List<Double> values) {
            addCriterion("goods_price_old in", values, "goodsPriceOld");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceOldNotIn(List<Double> values) {
            addCriterion("goods_price_old not in", values, "goodsPriceOld");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceOldBetween(Double value1, Double value2) {
            addCriterion("goods_price_old between", value1, value2, "goodsPriceOld");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceOldNotBetween(Double value1, Double value2) {
            addCriterion("goods_price_old not between", value1, value2, "goodsPriceOld");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNewIsNull() {
            addCriterion("goods_price_new is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNewIsNotNull() {
            addCriterion("goods_price_new is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNewEqualTo(Double value) {
            addCriterion("goods_price_new =", value, "goodsPriceNew");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNewNotEqualTo(Double value) {
            addCriterion("goods_price_new <>", value, "goodsPriceNew");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNewGreaterThan(Double value) {
            addCriterion("goods_price_new >", value, "goodsPriceNew");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNewGreaterThanOrEqualTo(Double value) {
            addCriterion("goods_price_new >=", value, "goodsPriceNew");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNewLessThan(Double value) {
            addCriterion("goods_price_new <", value, "goodsPriceNew");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNewLessThanOrEqualTo(Double value) {
            addCriterion("goods_price_new <=", value, "goodsPriceNew");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNewIn(List<Double> values) {
            addCriterion("goods_price_new in", values, "goodsPriceNew");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNewNotIn(List<Double> values) {
            addCriterion("goods_price_new not in", values, "goodsPriceNew");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNewBetween(Double value1, Double value2) {
            addCriterion("goods_price_new between", value1, value2, "goodsPriceNew");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNewNotBetween(Double value1, Double value2) {
            addCriterion("goods_price_new not between", value1, value2, "goodsPriceNew");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIsNull() {
            addCriterion("goods_img is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIsNotNull() {
            addCriterion("goods_img is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImgEqualTo(String value) {
            addCriterion("goods_img =", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotEqualTo(String value) {
            addCriterion("goods_img <>", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgGreaterThan(String value) {
            addCriterion("goods_img >", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgGreaterThanOrEqualTo(String value) {
            addCriterion("goods_img >=", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgLessThan(String value) {
            addCriterion("goods_img <", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgLessThanOrEqualTo(String value) {
            addCriterion("goods_img <=", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgLike(String value) {
            addCriterion("goods_img like", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotLike(String value) {
            addCriterion("goods_img not like", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIn(List<String> values) {
            addCriterion("goods_img in", values, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotIn(List<String> values) {
            addCriterion("goods_img not in", values, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgBetween(String value1, String value2) {
            addCriterion("goods_img between", value1, value2, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotBetween(String value1, String value2) {
            addCriterion("goods_img not between", value1, value2, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsLrrqIsNull() {
            addCriterion("goods_lrrq is null");
            return (Criteria) this;
        }

        public Criteria andGoodsLrrqIsNotNull() {
            addCriterion("goods_lrrq is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsLrrqEqualTo(Date value) {
            addCriterionForJDBCDate("goods_lrrq =", value, "goodsLrrq");
            return (Criteria) this;
        }

        public Criteria andGoodsLrrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("goods_lrrq <>", value, "goodsLrrq");
            return (Criteria) this;
        }

        public Criteria andGoodsLrrqGreaterThan(Date value) {
            addCriterionForJDBCDate("goods_lrrq >", value, "goodsLrrq");
            return (Criteria) this;
        }

        public Criteria andGoodsLrrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("goods_lrrq >=", value, "goodsLrrq");
            return (Criteria) this;
        }

        public Criteria andGoodsLrrqLessThan(Date value) {
            addCriterionForJDBCDate("goods_lrrq <", value, "goodsLrrq");
            return (Criteria) this;
        }

        public Criteria andGoodsLrrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("goods_lrrq <=", value, "goodsLrrq");
            return (Criteria) this;
        }

        public Criteria andGoodsLrrqIn(List<Date> values) {
            addCriterionForJDBCDate("goods_lrrq in", values, "goodsLrrq");
            return (Criteria) this;
        }

        public Criteria andGoodsLrrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("goods_lrrq not in", values, "goodsLrrq");
            return (Criteria) this;
        }

        public Criteria andGoodsLrrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("goods_lrrq between", value1, value2, "goodsLrrq");
            return (Criteria) this;
        }

        public Criteria andGoodsLrrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("goods_lrrq not between", value1, value2, "goodsLrrq");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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