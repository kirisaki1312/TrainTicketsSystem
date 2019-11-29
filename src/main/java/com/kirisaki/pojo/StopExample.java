package com.kirisaki.pojo;

import java.util.ArrayList;
import java.util.List;

public class StopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StopExample() {
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

        public Criteria andStop_idIsNull() {
            addCriterion("stop_id is null");
            return (Criteria) this;
        }

        public Criteria andStop_idIsNotNull() {
            addCriterion("stop_id is not null");
            return (Criteria) this;
        }

        public Criteria andStop_idEqualTo(Integer value) {
            addCriterion("stop_id =", value, "stop_id");
            return (Criteria) this;
        }

        public Criteria andStop_idNotEqualTo(Integer value) {
            addCriterion("stop_id <>", value, "stop_id");
            return (Criteria) this;
        }

        public Criteria andStop_idGreaterThan(Integer value) {
            addCriterion("stop_id >", value, "stop_id");
            return (Criteria) this;
        }

        public Criteria andStop_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("stop_id >=", value, "stop_id");
            return (Criteria) this;
        }

        public Criteria andStop_idLessThan(Integer value) {
            addCriterion("stop_id <", value, "stop_id");
            return (Criteria) this;
        }

        public Criteria andStop_idLessThanOrEqualTo(Integer value) {
            addCriterion("stop_id <=", value, "stop_id");
            return (Criteria) this;
        }

        public Criteria andStop_idIn(List<Integer> values) {
            addCriterion("stop_id in", values, "stop_id");
            return (Criteria) this;
        }

        public Criteria andStop_idNotIn(List<Integer> values) {
            addCriterion("stop_id not in", values, "stop_id");
            return (Criteria) this;
        }

        public Criteria andStop_idBetween(Integer value1, Integer value2) {
            addCriterion("stop_id between", value1, value2, "stop_id");
            return (Criteria) this;
        }

        public Criteria andStop_idNotBetween(Integer value1, Integer value2) {
            addCriterion("stop_id not between", value1, value2, "stop_id");
            return (Criteria) this;
        }

        public Criteria andStop_nameIsNull() {
            addCriterion("stop_name is null");
            return (Criteria) this;
        }

        public Criteria andStop_nameIsNotNull() {
            addCriterion("stop_name is not null");
            return (Criteria) this;
        }

        public Criteria andStop_nameEqualTo(String value) {
            addCriterion("stop_name =", value, "stop_name");
            return (Criteria) this;
        }

        public Criteria andStop_nameNotEqualTo(String value) {
            addCriterion("stop_name <>", value, "stop_name");
            return (Criteria) this;
        }

        public Criteria andStop_nameGreaterThan(String value) {
            addCriterion("stop_name >", value, "stop_name");
            return (Criteria) this;
        }

        public Criteria andStop_nameGreaterThanOrEqualTo(String value) {
            addCriterion("stop_name >=", value, "stop_name");
            return (Criteria) this;
        }

        public Criteria andStop_nameLessThan(String value) {
            addCriterion("stop_name <", value, "stop_name");
            return (Criteria) this;
        }

        public Criteria andStop_nameLessThanOrEqualTo(String value) {
            addCriterion("stop_name <=", value, "stop_name");
            return (Criteria) this;
        }

        public Criteria andStop_nameLike(String value) {
            addCriterion("stop_name like", value, "stop_name");
            return (Criteria) this;
        }

        public Criteria andStop_nameNotLike(String value) {
            addCriterion("stop_name not like", value, "stop_name");
            return (Criteria) this;
        }

        public Criteria andStop_nameIn(List<String> values) {
            addCriterion("stop_name in", values, "stop_name");
            return (Criteria) this;
        }

        public Criteria andStop_nameNotIn(List<String> values) {
            addCriterion("stop_name not in", values, "stop_name");
            return (Criteria) this;
        }

        public Criteria andStop_nameBetween(String value1, String value2) {
            addCriterion("stop_name between", value1, value2, "stop_name");
            return (Criteria) this;
        }

        public Criteria andStop_nameNotBetween(String value1, String value2) {
            addCriterion("stop_name not between", value1, value2, "stop_name");
            return (Criteria) this;
        }

        public Criteria andCity_nameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCity_nameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCity_nameEqualTo(String value) {
            addCriterion("city_name =", value, "city_name");
            return (Criteria) this;
        }

        public Criteria andCity_nameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "city_name");
            return (Criteria) this;
        }

        public Criteria andCity_nameGreaterThan(String value) {
            addCriterion("city_name >", value, "city_name");
            return (Criteria) this;
        }

        public Criteria andCity_nameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "city_name");
            return (Criteria) this;
        }

        public Criteria andCity_nameLessThan(String value) {
            addCriterion("city_name <", value, "city_name");
            return (Criteria) this;
        }

        public Criteria andCity_nameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "city_name");
            return (Criteria) this;
        }

        public Criteria andCity_nameLike(String value) {
            addCriterion("city_name like", value, "city_name");
            return (Criteria) this;
        }

        public Criteria andCity_nameNotLike(String value) {
            addCriterion("city_name not like", value, "city_name");
            return (Criteria) this;
        }

        public Criteria andCity_nameIn(List<String> values) {
            addCriterion("city_name in", values, "city_name");
            return (Criteria) this;
        }

        public Criteria andCity_nameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "city_name");
            return (Criteria) this;
        }

        public Criteria andCity_nameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "city_name");
            return (Criteria) this;
        }

        public Criteria andCity_nameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "city_name");
            return (Criteria) this;
        }
    }

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