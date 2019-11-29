package com.kirisaki.pojo;

import java.util.ArrayList;
import java.util.List;

public class SeatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SeatExample() {
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

        public Criteria andSeat_idIsNull() {
            addCriterion("seat_id is null");
            return (Criteria) this;
        }

        public Criteria andSeat_idIsNotNull() {
            addCriterion("seat_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeat_idEqualTo(Integer value) {
            addCriterion("seat_id =", value, "seat_id");
            return (Criteria) this;
        }

        public Criteria andSeat_idNotEqualTo(Integer value) {
            addCriterion("seat_id <>", value, "seat_id");
            return (Criteria) this;
        }

        public Criteria andSeat_idGreaterThan(Integer value) {
            addCriterion("seat_id >", value, "seat_id");
            return (Criteria) this;
        }

        public Criteria andSeat_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_id >=", value, "seat_id");
            return (Criteria) this;
        }

        public Criteria andSeat_idLessThan(Integer value) {
            addCriterion("seat_id <", value, "seat_id");
            return (Criteria) this;
        }

        public Criteria andSeat_idLessThanOrEqualTo(Integer value) {
            addCriterion("seat_id <=", value, "seat_id");
            return (Criteria) this;
        }

        public Criteria andSeat_idIn(List<Integer> values) {
            addCriterion("seat_id in", values, "seat_id");
            return (Criteria) this;
        }

        public Criteria andSeat_idNotIn(List<Integer> values) {
            addCriterion("seat_id not in", values, "seat_id");
            return (Criteria) this;
        }

        public Criteria andSeat_idBetween(Integer value1, Integer value2) {
            addCriterion("seat_id between", value1, value2, "seat_id");
            return (Criteria) this;
        }

        public Criteria andSeat_idNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_id not between", value1, value2, "seat_id");
            return (Criteria) this;
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

        public Criteria andSeat_typeIsNull() {
            addCriterion("seat_type is null");
            return (Criteria) this;
        }

        public Criteria andSeat_typeIsNotNull() {
            addCriterion("seat_type is not null");
            return (Criteria) this;
        }

        public Criteria andSeat_typeEqualTo(String value) {
            addCriterion("seat_type =", value, "seat_type");
            return (Criteria) this;
        }

        public Criteria andSeat_typeNotEqualTo(String value) {
            addCriterion("seat_type <>", value, "seat_type");
            return (Criteria) this;
        }

        public Criteria andSeat_typeGreaterThan(String value) {
            addCriterion("seat_type >", value, "seat_type");
            return (Criteria) this;
        }

        public Criteria andSeat_typeGreaterThanOrEqualTo(String value) {
            addCriterion("seat_type >=", value, "seat_type");
            return (Criteria) this;
        }

        public Criteria andSeat_typeLessThan(String value) {
            addCriterion("seat_type <", value, "seat_type");
            return (Criteria) this;
        }

        public Criteria andSeat_typeLessThanOrEqualTo(String value) {
            addCriterion("seat_type <=", value, "seat_type");
            return (Criteria) this;
        }

        public Criteria andSeat_typeLike(String value) {
            addCriterion("seat_type like", value, "seat_type");
            return (Criteria) this;
        }

        public Criteria andSeat_typeNotLike(String value) {
            addCriterion("seat_type not like", value, "seat_type");
            return (Criteria) this;
        }

        public Criteria andSeat_typeIn(List<String> values) {
            addCriterion("seat_type in", values, "seat_type");
            return (Criteria) this;
        }

        public Criteria andSeat_typeNotIn(List<String> values) {
            addCriterion("seat_type not in", values, "seat_type");
            return (Criteria) this;
        }

        public Criteria andSeat_typeBetween(String value1, String value2) {
            addCriterion("seat_type between", value1, value2, "seat_type");
            return (Criteria) this;
        }

        public Criteria andSeat_typeNotBetween(String value1, String value2) {
            addCriterion("seat_type not between", value1, value2, "seat_type");
            return (Criteria) this;
        }

        public Criteria andSeat_locationIsNull() {
            addCriterion("seat_location is null");
            return (Criteria) this;
        }

        public Criteria andSeat_locationIsNotNull() {
            addCriterion("seat_location is not null");
            return (Criteria) this;
        }

        public Criteria andSeat_locationEqualTo(String value) {
            addCriterion("seat_location =", value, "seat_location");
            return (Criteria) this;
        }

        public Criteria andSeat_locationNotEqualTo(String value) {
            addCriterion("seat_location <>", value, "seat_location");
            return (Criteria) this;
        }

        public Criteria andSeat_locationGreaterThan(String value) {
            addCriterion("seat_location >", value, "seat_location");
            return (Criteria) this;
        }

        public Criteria andSeat_locationGreaterThanOrEqualTo(String value) {
            addCriterion("seat_location >=", value, "seat_location");
            return (Criteria) this;
        }

        public Criteria andSeat_locationLessThan(String value) {
            addCriterion("seat_location <", value, "seat_location");
            return (Criteria) this;
        }

        public Criteria andSeat_locationLessThanOrEqualTo(String value) {
            addCriterion("seat_location <=", value, "seat_location");
            return (Criteria) this;
        }

        public Criteria andSeat_locationLike(String value) {
            addCriterion("seat_location like", value, "seat_location");
            return (Criteria) this;
        }

        public Criteria andSeat_locationNotLike(String value) {
            addCriterion("seat_location not like", value, "seat_location");
            return (Criteria) this;
        }

        public Criteria andSeat_locationIn(List<String> values) {
            addCriterion("seat_location in", values, "seat_location");
            return (Criteria) this;
        }

        public Criteria andSeat_locationNotIn(List<String> values) {
            addCriterion("seat_location not in", values, "seat_location");
            return (Criteria) this;
        }

        public Criteria andSeat_locationBetween(String value1, String value2) {
            addCriterion("seat_location between", value1, value2, "seat_location");
            return (Criteria) this;
        }

        public Criteria andSeat_locationNotBetween(String value1, String value2) {
            addCriterion("seat_location not between", value1, value2, "seat_location");
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