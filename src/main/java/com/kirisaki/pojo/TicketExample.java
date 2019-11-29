package com.kirisaki.pojo;

import java.util.ArrayList;
import java.util.List;

public class TicketExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TicketExample() {
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

        public Criteria andTicket_idIsNull() {
            addCriterion("ticket_id is null");
            return (Criteria) this;
        }

        public Criteria andTicket_idIsNotNull() {
            addCriterion("ticket_id is not null");
            return (Criteria) this;
        }

        public Criteria andTicket_idEqualTo(Integer value) {
            addCriterion("ticket_id =", value, "ticket_id");
            return (Criteria) this;
        }

        public Criteria andTicket_idNotEqualTo(Integer value) {
            addCriterion("ticket_id <>", value, "ticket_id");
            return (Criteria) this;
        }

        public Criteria andTicket_idGreaterThan(Integer value) {
            addCriterion("ticket_id >", value, "ticket_id");
            return (Criteria) this;
        }

        public Criteria andTicket_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("ticket_id >=", value, "ticket_id");
            return (Criteria) this;
        }

        public Criteria andTicket_idLessThan(Integer value) {
            addCriterion("ticket_id <", value, "ticket_id");
            return (Criteria) this;
        }

        public Criteria andTicket_idLessThanOrEqualTo(Integer value) {
            addCriterion("ticket_id <=", value, "ticket_id");
            return (Criteria) this;
        }

        public Criteria andTicket_idIn(List<Integer> values) {
            addCriterion("ticket_id in", values, "ticket_id");
            return (Criteria) this;
        }

        public Criteria andTicket_idNotIn(List<Integer> values) {
            addCriterion("ticket_id not in", values, "ticket_id");
            return (Criteria) this;
        }

        public Criteria andTicket_idBetween(Integer value1, Integer value2) {
            addCriterion("ticket_id between", value1, value2, "ticket_id");
            return (Criteria) this;
        }

        public Criteria andTicket_idNotBetween(Integer value1, Integer value2) {
            addCriterion("ticket_id not between", value1, value2, "ticket_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_idEqualTo(Integer value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(Integer value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(Integer value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIn(List<Integer> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "user_id");
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

        public Criteria andStart_timeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStart_timeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStart_timeEqualTo(String value) {
            addCriterion("start_time =", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeNotEqualTo(String value) {
            addCriterion("start_time <>", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeGreaterThan(String value) {
            addCriterion("start_time >", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeGreaterThanOrEqualTo(String value) {
            addCriterion("start_time >=", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeLessThan(String value) {
            addCriterion("start_time <", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeLessThanOrEqualTo(String value) {
            addCriterion("start_time <=", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeLike(String value) {
            addCriterion("start_time like", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeNotLike(String value) {
            addCriterion("start_time not like", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeIn(List<String> values) {
            addCriterion("start_time in", values, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeNotIn(List<String> values) {
            addCriterion("start_time not in", values, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeBetween(String value1, String value2) {
            addCriterion("start_time between", value1, value2, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeNotBetween(String value1, String value2) {
            addCriterion("start_time not between", value1, value2, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_stop_idIsNull() {
            addCriterion("start_stop_id is null");
            return (Criteria) this;
        }

        public Criteria andStart_stop_idIsNotNull() {
            addCriterion("start_stop_id is not null");
            return (Criteria) this;
        }

        public Criteria andStart_stop_idEqualTo(Integer value) {
            addCriterion("start_stop_id =", value, "start_stop_id");
            return (Criteria) this;
        }

        public Criteria andStart_stop_idNotEqualTo(Integer value) {
            addCriterion("start_stop_id <>", value, "start_stop_id");
            return (Criteria) this;
        }

        public Criteria andStart_stop_idGreaterThan(Integer value) {
            addCriterion("start_stop_id >", value, "start_stop_id");
            return (Criteria) this;
        }

        public Criteria andStart_stop_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("start_stop_id >=", value, "start_stop_id");
            return (Criteria) this;
        }

        public Criteria andStart_stop_idLessThan(Integer value) {
            addCriterion("start_stop_id <", value, "start_stop_id");
            return (Criteria) this;
        }

        public Criteria andStart_stop_idLessThanOrEqualTo(Integer value) {
            addCriterion("start_stop_id <=", value, "start_stop_id");
            return (Criteria) this;
        }

        public Criteria andStart_stop_idIn(List<Integer> values) {
            addCriterion("start_stop_id in", values, "start_stop_id");
            return (Criteria) this;
        }

        public Criteria andStart_stop_idNotIn(List<Integer> values) {
            addCriterion("start_stop_id not in", values, "start_stop_id");
            return (Criteria) this;
        }

        public Criteria andStart_stop_idBetween(Integer value1, Integer value2) {
            addCriterion("start_stop_id between", value1, value2, "start_stop_id");
            return (Criteria) this;
        }

        public Criteria andStart_stop_idNotBetween(Integer value1, Integer value2) {
            addCriterion("start_stop_id not between", value1, value2, "start_stop_id");
            return (Criteria) this;
        }

        public Criteria andEnd_timeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEnd_timeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnd_timeEqualTo(String value) {
            addCriterion("end_time =", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeNotEqualTo(String value) {
            addCriterion("end_time <>", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeGreaterThan(String value) {
            addCriterion("end_time >", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeGreaterThanOrEqualTo(String value) {
            addCriterion("end_time >=", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeLessThan(String value) {
            addCriterion("end_time <", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeLessThanOrEqualTo(String value) {
            addCriterion("end_time <=", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeLike(String value) {
            addCriterion("end_time like", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeNotLike(String value) {
            addCriterion("end_time not like", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeIn(List<String> values) {
            addCriterion("end_time in", values, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeNotIn(List<String> values) {
            addCriterion("end_time not in", values, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeBetween(String value1, String value2) {
            addCriterion("end_time between", value1, value2, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeNotBetween(String value1, String value2) {
            addCriterion("end_time not between", value1, value2, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_stop_idIsNull() {
            addCriterion("end_stop_id is null");
            return (Criteria) this;
        }

        public Criteria andEnd_stop_idIsNotNull() {
            addCriterion("end_stop_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnd_stop_idEqualTo(Integer value) {
            addCriterion("end_stop_id =", value, "end_stop_id");
            return (Criteria) this;
        }

        public Criteria andEnd_stop_idNotEqualTo(Integer value) {
            addCriterion("end_stop_id <>", value, "end_stop_id");
            return (Criteria) this;
        }

        public Criteria andEnd_stop_idGreaterThan(Integer value) {
            addCriterion("end_stop_id >", value, "end_stop_id");
            return (Criteria) this;
        }

        public Criteria andEnd_stop_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("end_stop_id >=", value, "end_stop_id");
            return (Criteria) this;
        }

        public Criteria andEnd_stop_idLessThan(Integer value) {
            addCriterion("end_stop_id <", value, "end_stop_id");
            return (Criteria) this;
        }

        public Criteria andEnd_stop_idLessThanOrEqualTo(Integer value) {
            addCriterion("end_stop_id <=", value, "end_stop_id");
            return (Criteria) this;
        }

        public Criteria andEnd_stop_idIn(List<Integer> values) {
            addCriterion("end_stop_id in", values, "end_stop_id");
            return (Criteria) this;
        }

        public Criteria andEnd_stop_idNotIn(List<Integer> values) {
            addCriterion("end_stop_id not in", values, "end_stop_id");
            return (Criteria) this;
        }

        public Criteria andEnd_stop_idBetween(Integer value1, Integer value2) {
            addCriterion("end_stop_id between", value1, value2, "end_stop_id");
            return (Criteria) this;
        }

        public Criteria andEnd_stop_idNotBetween(Integer value1, Integer value2) {
            addCriterion("end_stop_id not between", value1, value2, "end_stop_id");
            return (Criteria) this;
        }

        public Criteria andCreate_atIsNull() {
            addCriterion("create_at is null");
            return (Criteria) this;
        }

        public Criteria andCreate_atIsNotNull() {
            addCriterion("create_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_atEqualTo(String value) {
            addCriterion("create_at =", value, "create_at");
            return (Criteria) this;
        }

        public Criteria andCreate_atNotEqualTo(String value) {
            addCriterion("create_at <>", value, "create_at");
            return (Criteria) this;
        }

        public Criteria andCreate_atGreaterThan(String value) {
            addCriterion("create_at >", value, "create_at");
            return (Criteria) this;
        }

        public Criteria andCreate_atGreaterThanOrEqualTo(String value) {
            addCriterion("create_at >=", value, "create_at");
            return (Criteria) this;
        }

        public Criteria andCreate_atLessThan(String value) {
            addCriterion("create_at <", value, "create_at");
            return (Criteria) this;
        }

        public Criteria andCreate_atLessThanOrEqualTo(String value) {
            addCriterion("create_at <=", value, "create_at");
            return (Criteria) this;
        }

        public Criteria andCreate_atLike(String value) {
            addCriterion("create_at like", value, "create_at");
            return (Criteria) this;
        }

        public Criteria andCreate_atNotLike(String value) {
            addCriterion("create_at not like", value, "create_at");
            return (Criteria) this;
        }

        public Criteria andCreate_atIn(List<String> values) {
            addCriterion("create_at in", values, "create_at");
            return (Criteria) this;
        }

        public Criteria andCreate_atNotIn(List<String> values) {
            addCriterion("create_at not in", values, "create_at");
            return (Criteria) this;
        }

        public Criteria andCreate_atBetween(String value1, String value2) {
            addCriterion("create_at between", value1, value2, "create_at");
            return (Criteria) this;
        }

        public Criteria andCreate_atNotBetween(String value1, String value2) {
            addCriterion("create_at not between", value1, value2, "create_at");
            return (Criteria) this;
        }

        public Criteria andExpenseIsNull() {
            addCriterion("expense is null");
            return (Criteria) this;
        }

        public Criteria andExpenseIsNotNull() {
            addCriterion("expense is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseEqualTo(Double value) {
            addCriterion("expense =", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseNotEqualTo(Double value) {
            addCriterion("expense <>", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseGreaterThan(Double value) {
            addCriterion("expense >", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseGreaterThanOrEqualTo(Double value) {
            addCriterion("expense >=", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseLessThan(Double value) {
            addCriterion("expense <", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseLessThanOrEqualTo(Double value) {
            addCriterion("expense <=", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseIn(List<Double> values) {
            addCriterion("expense in", values, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseNotIn(List<Double> values) {
            addCriterion("expense not in", values, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseBetween(Double value1, Double value2) {
            addCriterion("expense between", value1, value2, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseNotBetween(Double value1, Double value2) {
            addCriterion("expense not between", value1, value2, "expense");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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