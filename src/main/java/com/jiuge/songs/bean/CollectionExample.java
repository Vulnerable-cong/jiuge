package com.jiuge.songs.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CollectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollectionExample() {
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

        public Criteria andCollection_IDIsNull() {
            addCriterion("collection_ID is null");
            return (Criteria) this;
        }

        public Criteria andCollection_IDIsNotNull() {
            addCriterion("collection_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCollection_IDEqualTo(Integer value) {
            addCriterion("collection_ID =", value, "collection_ID");
            return (Criteria) this;
        }

        public Criteria andCollection_IDNotEqualTo(Integer value) {
            addCriterion("collection_ID <>", value, "collection_ID");
            return (Criteria) this;
        }

        public Criteria andCollection_IDGreaterThan(Integer value) {
            addCriterion("collection_ID >", value, "collection_ID");
            return (Criteria) this;
        }

        public Criteria andCollection_IDGreaterThanOrEqualTo(Integer value) {
            addCriterion("collection_ID >=", value, "collection_ID");
            return (Criteria) this;
        }

        public Criteria andCollection_IDLessThan(Integer value) {
            addCriterion("collection_ID <", value, "collection_ID");
            return (Criteria) this;
        }

        public Criteria andCollection_IDLessThanOrEqualTo(Integer value) {
            addCriterion("collection_ID <=", value, "collection_ID");
            return (Criteria) this;
        }

        public Criteria andCollection_IDIn(List<Integer> values) {
            addCriterion("collection_ID in", values, "collection_ID");
            return (Criteria) this;
        }

        public Criteria andCollection_IDNotIn(List<Integer> values) {
            addCriterion("collection_ID not in", values, "collection_ID");
            return (Criteria) this;
        }

        public Criteria andCollection_IDBetween(Integer value1, Integer value2) {
            addCriterion("collection_ID between", value1, value2, "collection_ID");
            return (Criteria) this;
        }

        public Criteria andCollection_IDNotBetween(Integer value1, Integer value2) {
            addCriterion("collection_ID not between", value1, value2, "collection_ID");
            return (Criteria) this;
        }

        public Criteria andSong_IDIsNull() {
            addCriterion("song_ID is null");
            return (Criteria) this;
        }

        public Criteria andSong_IDIsNotNull() {
            addCriterion("song_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSong_IDEqualTo(Integer value) {
            addCriterion("song_ID =", value, "song_ID");
            return (Criteria) this;
        }

        public Criteria andSong_IDNotEqualTo(Integer value) {
            addCriterion("song_ID <>", value, "song_ID");
            return (Criteria) this;
        }

        public Criteria andSong_IDGreaterThan(Integer value) {
            addCriterion("song_ID >", value, "song_ID");
            return (Criteria) this;
        }

        public Criteria andSong_IDGreaterThanOrEqualTo(Integer value) {
            addCriterion("song_ID >=", value, "song_ID");
            return (Criteria) this;
        }

        public Criteria andSong_IDLessThan(Integer value) {
            addCriterion("song_ID <", value, "song_ID");
            return (Criteria) this;
        }

        public Criteria andSong_IDLessThanOrEqualTo(Integer value) {
            addCriterion("song_ID <=", value, "song_ID");
            return (Criteria) this;
        }

        public Criteria andSong_IDIn(List<Integer> values) {
            addCriterion("song_ID in", values, "song_ID");
            return (Criteria) this;
        }

        public Criteria andSong_IDNotIn(List<Integer> values) {
            addCriterion("song_ID not in", values, "song_ID");
            return (Criteria) this;
        }

        public Criteria andSong_IDBetween(Integer value1, Integer value2) {
            addCriterion("song_ID between", value1, value2, "song_ID");
            return (Criteria) this;
        }

        public Criteria andSong_IDNotBetween(Integer value1, Integer value2) {
            addCriterion("song_ID not between", value1, value2, "song_ID");
            return (Criteria) this;
        }

        public Criteria andUser_IDIsNull() {
            addCriterion("user_ID is null");
            return (Criteria) this;
        }

        public Criteria andUser_IDIsNotNull() {
            addCriterion("user_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUser_IDEqualTo(Integer value) {
            addCriterion("user_ID =", value, "user_ID");
            return (Criteria) this;
        }

        public Criteria andUser_IDNotEqualTo(Integer value) {
            addCriterion("user_ID <>", value, "user_ID");
            return (Criteria) this;
        }

        public Criteria andUser_IDGreaterThan(Integer value) {
            addCriterion("user_ID >", value, "user_ID");
            return (Criteria) this;
        }

        public Criteria andUser_IDGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_ID >=", value, "user_ID");
            return (Criteria) this;
        }

        public Criteria andUser_IDLessThan(Integer value) {
            addCriterion("user_ID <", value, "user_ID");
            return (Criteria) this;
        }

        public Criteria andUser_IDLessThanOrEqualTo(Integer value) {
            addCriterion("user_ID <=", value, "user_ID");
            return (Criteria) this;
        }

        public Criteria andUser_IDIn(List<Integer> values) {
            addCriterion("user_ID in", values, "user_ID");
            return (Criteria) this;
        }

        public Criteria andUser_IDNotIn(List<Integer> values) {
            addCriterion("user_ID not in", values, "user_ID");
            return (Criteria) this;
        }

        public Criteria andUser_IDBetween(Integer value1, Integer value2) {
            addCriterion("user_ID between", value1, value2, "user_ID");
            return (Criteria) this;
        }

        public Criteria andUser_IDNotBetween(Integer value1, Integer value2) {
            addCriterion("user_ID not between", value1, value2, "user_ID");
            return (Criteria) this;
        }

        public Criteria andC_nameIsNull() {
            addCriterion("c_name is null");
            return (Criteria) this;
        }

        public Criteria andC_nameIsNotNull() {
            addCriterion("c_name is not null");
            return (Criteria) this;
        }

        public Criteria andC_nameEqualTo(String value) {
            addCriterion("c_name =", value, "c_name");
            return (Criteria) this;
        }

        public Criteria andC_nameNotEqualTo(String value) {
            addCriterion("c_name <>", value, "c_name");
            return (Criteria) this;
        }

        public Criteria andC_nameGreaterThan(String value) {
            addCriterion("c_name >", value, "c_name");
            return (Criteria) this;
        }

        public Criteria andC_nameGreaterThanOrEqualTo(String value) {
            addCriterion("c_name >=", value, "c_name");
            return (Criteria) this;
        }

        public Criteria andC_nameLessThan(String value) {
            addCriterion("c_name <", value, "c_name");
            return (Criteria) this;
        }

        public Criteria andC_nameLessThanOrEqualTo(String value) {
            addCriterion("c_name <=", value, "c_name");
            return (Criteria) this;
        }

        public Criteria andC_nameLike(String value) {
            addCriterion("c_name like", value, "c_name");
            return (Criteria) this;
        }

        public Criteria andC_nameNotLike(String value) {
            addCriterion("c_name not like", value, "c_name");
            return (Criteria) this;
        }

        public Criteria andC_nameIn(List<String> values) {
            addCriterion("c_name in", values, "c_name");
            return (Criteria) this;
        }

        public Criteria andC_nameNotIn(List<String> values) {
            addCriterion("c_name not in", values, "c_name");
            return (Criteria) this;
        }

        public Criteria andC_nameBetween(String value1, String value2) {
            addCriterion("c_name between", value1, value2, "c_name");
            return (Criteria) this;
        }

        public Criteria andC_nameNotBetween(String value1, String value2) {
            addCriterion("c_name not between", value1, value2, "c_name");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createtime not between", value1, value2, "createtime");
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