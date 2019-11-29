package com.kirisaki.pojo;

import java.util.ArrayList;
import java.util.List;

public class LineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LineExample() {
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

        public Criteria andTrain_idIsNull() {
            addCriterion("train_id is null");
            return (Criteria) this;
        }

        public Criteria andTrain_idIsNotNull() {
            addCriterion("train_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrain_idEqualTo(Integer value) {
            addCriterion("train_id =", value, "train_id");
            return (Criteria) this;
        }

        public Criteria andTrain_idNotEqualTo(Integer value) {
            addCriterion("train_id <>", value, "train_id");
            return (Criteria) this;
        }

        public Criteria andTrain_idGreaterThan(Integer value) {
            addCriterion("train_id >", value, "train_id");
            return (Criteria) this;
        }

        public Criteria andTrain_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("train_id >=", value, "train_id");
            return (Criteria) this;
        }

        public Criteria andTrain_idLessThan(Integer value) {
            addCriterion("train_id <", value, "train_id");
            return (Criteria) this;
        }

        public Criteria andTrain_idLessThanOrEqualTo(Integer value) {
            addCriterion("train_id <=", value, "train_id");
            return (Criteria) this;
        }

        public Criteria andTrain_idIn(List<Integer> values) {
            addCriterion("train_id in", values, "train_id");
            return (Criteria) this;
        }

        public Criteria andTrain_idNotIn(List<Integer> values) {
            addCriterion("train_id not in", values, "train_id");
            return (Criteria) this;
        }

        public Criteria andTrain_idBetween(Integer value1, Integer value2) {
            addCriterion("train_id between", value1, value2, "train_id");
            return (Criteria) this;
        }

        public Criteria andTrain_idNotBetween(Integer value1, Integer value2) {
            addCriterion("train_id not between", value1, value2, "train_id");
            return (Criteria) this;
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

        public Criteria andArrive_timeIsNull() {
            addCriterion("arrive_time is null");
            return (Criteria) this;
        }

        public Criteria andArrive_timeIsNotNull() {
            addCriterion("arrive_time is not null");
            return (Criteria) this;
        }

        public Criteria andArrive_timeEqualTo(String value) {
            addCriterion("arrive_time =", value, "arrive_time");
            return (Criteria) this;
        }

        public Criteria andArrive_timeNotEqualTo(String value) {
            addCriterion("arrive_time <>", value, "arrive_time");
            return (Criteria) this;
        }

        public Criteria andArrive_timeGreaterThan(String value) {
            addCriterion("arrive_time >", value, "arrive_time");
            return (Criteria) this;
        }

        public Criteria andArrive_timeGreaterThanOrEqualTo(String value) {
            addCriterion("arrive_time >=", value, "arrive_time");
            return (Criteria) this;
        }

        public Criteria andArrive_timeLessThan(String value) {
            addCriterion("arrive_time <", value, "arrive_time");
            return (Criteria) this;
        }

        public Criteria andArrive_timeLessThanOrEqualTo(String value) {
            addCriterion("arrive_time <=", value, "arrive_time");
            return (Criteria) this;
        }

        public Criteria andArrive_timeLike(String value) {
            addCriterion("arrive_time like", value, "arrive_time");
            return (Criteria) this;
        }

        public Criteria andArrive_timeNotLike(String value) {
            addCriterion("arrive_time not like", value, "arrive_time");
            return (Criteria) this;
        }

        public Criteria andArrive_timeIn(List<String> values) {
            addCriterion("arrive_time in", values, "arrive_time");
            return (Criteria) this;
        }

        public Criteria andArrive_timeNotIn(List<String> values) {
            addCriterion("arrive_time not in", values, "arrive_time");
            return (Criteria) this;
        }

        public Criteria andArrive_timeBetween(String value1, String value2) {
            addCriterion("arrive_time between", value1, value2, "arrive_time");
            return (Criteria) this;
        }

        public Criteria andArrive_timeNotBetween(String value1, String value2) {
            addCriterion("arrive_time not between", value1, value2, "arrive_time");
            return (Criteria) this;
        }

        public Criteria andMileageIsNull() {
            addCriterion("mileage is null");
            return (Criteria) this;
        }

        public Criteria andMileageIsNotNull() {
            addCriterion("mileage is not null");
            return (Criteria) this;
        }

        public Criteria andMileageEqualTo(Double value) {
            addCriterion("mileage =", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotEqualTo(Double value) {
            addCriterion("mileage <>", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageGreaterThan(Double value) {
            addCriterion("mileage >", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageGreaterThanOrEqualTo(Double value) {
            addCriterion("mileage >=", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLessThan(Double value) {
            addCriterion("mileage <", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLessThanOrEqualTo(Double value) {
            addCriterion("mileage <=", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageIn(List<Double> values) {
            addCriterion("mileage in", values, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotIn(List<Double> values) {
            addCriterion("mileage not in", values, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageBetween(Double value1, Double value2) {
            addCriterion("mileage between", value1, value2, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotBetween(Double value1, Double value2) {
            addCriterion("mileage not between", value1, value2, "mileage");
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