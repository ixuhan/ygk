package cn.ixuhan.ygk.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GoodsClassifyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public GoodsClassifyExample() {
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

        public Criteria andClassifyIdIsNull() {
            addCriterion("classify_id is null");
            return (Criteria) this;
        }

        public Criteria andClassifyIdIsNotNull() {
            addCriterion("classify_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassifyIdEqualTo(Integer value) {
            addCriterion("classify_id =", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdNotEqualTo(Integer value) {
            addCriterion("classify_id <>", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdGreaterThan(Integer value) {
            addCriterion("classify_id >", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("classify_id >=", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdLessThan(Integer value) {
            addCriterion("classify_id <", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdLessThanOrEqualTo(Integer value) {
            addCriterion("classify_id <=", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdIn(List<Integer> values) {
            addCriterion("classify_id in", values, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdNotIn(List<Integer> values) {
            addCriterion("classify_id not in", values, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdBetween(Integer value1, Integer value2) {
            addCriterion("classify_id between", value1, value2, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("classify_id not between", value1, value2, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyNameIsNull() {
            addCriterion("classify_name is null");
            return (Criteria) this;
        }

        public Criteria andClassifyNameIsNotNull() {
            addCriterion("classify_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassifyNameEqualTo(String value) {
            addCriterion("classify_name =", value, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameNotEqualTo(String value) {
            addCriterion("classify_name <>", value, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameGreaterThan(String value) {
            addCriterion("classify_name >", value, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameGreaterThanOrEqualTo(String value) {
            addCriterion("classify_name >=", value, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameLessThan(String value) {
            addCriterion("classify_name <", value, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameLessThanOrEqualTo(String value) {
            addCriterion("classify_name <=", value, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameLike(String value) {
            addCriterion("classify_name like", value, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameNotLike(String value) {
            addCriterion("classify_name not like", value, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameIn(List<String> values) {
            addCriterion("classify_name in", values, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameNotIn(List<String> values) {
            addCriterion("classify_name not in", values, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameBetween(String value1, String value2) {
            addCriterion("classify_name between", value1, value2, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameNotBetween(String value1, String value2) {
            addCriterion("classify_name not between", value1, value2, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyDescIsNull() {
            addCriterion("classify_desc is null");
            return (Criteria) this;
        }

        public Criteria andClassifyDescIsNotNull() {
            addCriterion("classify_desc is not null");
            return (Criteria) this;
        }

        public Criteria andClassifyDescEqualTo(String value) {
            addCriterion("classify_desc =", value, "classifyDesc");
            return (Criteria) this;
        }

        public Criteria andClassifyDescNotEqualTo(String value) {
            addCriterion("classify_desc <>", value, "classifyDesc");
            return (Criteria) this;
        }

        public Criteria andClassifyDescGreaterThan(String value) {
            addCriterion("classify_desc >", value, "classifyDesc");
            return (Criteria) this;
        }

        public Criteria andClassifyDescGreaterThanOrEqualTo(String value) {
            addCriterion("classify_desc >=", value, "classifyDesc");
            return (Criteria) this;
        }

        public Criteria andClassifyDescLessThan(String value) {
            addCriterion("classify_desc <", value, "classifyDesc");
            return (Criteria) this;
        }

        public Criteria andClassifyDescLessThanOrEqualTo(String value) {
            addCriterion("classify_desc <=", value, "classifyDesc");
            return (Criteria) this;
        }

        public Criteria andClassifyDescLike(String value) {
            addCriterion("classify_desc like", value, "classifyDesc");
            return (Criteria) this;
        }

        public Criteria andClassifyDescNotLike(String value) {
            addCriterion("classify_desc not like", value, "classifyDesc");
            return (Criteria) this;
        }

        public Criteria andClassifyDescIn(List<String> values) {
            addCriterion("classify_desc in", values, "classifyDesc");
            return (Criteria) this;
        }

        public Criteria andClassifyDescNotIn(List<String> values) {
            addCriterion("classify_desc not in", values, "classifyDesc");
            return (Criteria) this;
        }

        public Criteria andClassifyDescBetween(String value1, String value2) {
            addCriterion("classify_desc between", value1, value2, "classifyDesc");
            return (Criteria) this;
        }

        public Criteria andClassifyDescNotBetween(String value1, String value2) {
            addCriterion("classify_desc not between", value1, value2, "classifyDesc");
            return (Criteria) this;
        }

        public Criteria andClassifyLrrqIsNull() {
            addCriterion("classify_lrrq is null");
            return (Criteria) this;
        }

        public Criteria andClassifyLrrqIsNotNull() {
            addCriterion("classify_lrrq is not null");
            return (Criteria) this;
        }

        public Criteria andClassifyLrrqEqualTo(Date value) {
            addCriterionForJDBCDate("classify_lrrq =", value, "classifyLrrq");
            return (Criteria) this;
        }

        public Criteria andClassifyLrrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("classify_lrrq <>", value, "classifyLrrq");
            return (Criteria) this;
        }

        public Criteria andClassifyLrrqGreaterThan(Date value) {
            addCriterionForJDBCDate("classify_lrrq >", value, "classifyLrrq");
            return (Criteria) this;
        }

        public Criteria andClassifyLrrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("classify_lrrq >=", value, "classifyLrrq");
            return (Criteria) this;
        }

        public Criteria andClassifyLrrqLessThan(Date value) {
            addCriterionForJDBCDate("classify_lrrq <", value, "classifyLrrq");
            return (Criteria) this;
        }

        public Criteria andClassifyLrrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("classify_lrrq <=", value, "classifyLrrq");
            return (Criteria) this;
        }

        public Criteria andClassifyLrrqIn(List<Date> values) {
            addCriterionForJDBCDate("classify_lrrq in", values, "classifyLrrq");
            return (Criteria) this;
        }

        public Criteria andClassifyLrrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("classify_lrrq not in", values, "classifyLrrq");
            return (Criteria) this;
        }

        public Criteria andClassifyLrrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("classify_lrrq between", value1, value2, "classifyLrrq");
            return (Criteria) this;
        }

        public Criteria andClassifyLrrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("classify_lrrq not between", value1, value2, "classifyLrrq");
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