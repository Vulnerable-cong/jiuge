package com.jiuge.songs.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andU_accountIsNull() {
            addCriterion("u_account is null");
            return (Criteria) this;
        }

        public Criteria andU_accountIsNotNull() {
            addCriterion("u_account is not null");
            return (Criteria) this;
        }

        public Criteria andU_accountEqualTo(String value) {
            addCriterion("u_account =", value, "u_account");
            return (Criteria) this;
        }

        public Criteria andU_accountNotEqualTo(String value) {
            addCriterion("u_account <>", value, "u_account");
            return (Criteria) this;
        }

        public Criteria andU_accountGreaterThan(String value) {
            addCriterion("u_account >", value, "u_account");
            return (Criteria) this;
        }

        public Criteria andU_accountGreaterThanOrEqualTo(String value) {
            addCriterion("u_account >=", value, "u_account");
            return (Criteria) this;
        }

        public Criteria andU_accountLessThan(String value) {
            addCriterion("u_account <", value, "u_account");
            return (Criteria) this;
        }

        public Criteria andU_accountLessThanOrEqualTo(String value) {
            addCriterion("u_account <=", value, "u_account");
            return (Criteria) this;
        }

        public Criteria andU_accountLike(String value) {
            addCriterion("u_account like", value, "u_account");
            return (Criteria) this;
        }

        public Criteria andU_accountNotLike(String value) {
            addCriterion("u_account not like", value, "u_account");
            return (Criteria) this;
        }

        public Criteria andU_accountIn(List<String> values) {
            addCriterion("u_account in", values, "u_account");
            return (Criteria) this;
        }

        public Criteria andU_accountNotIn(List<String> values) {
            addCriterion("u_account not in", values, "u_account");
            return (Criteria) this;
        }

        public Criteria andU_accountBetween(String value1, String value2) {
            addCriterion("u_account between", value1, value2, "u_account");
            return (Criteria) this;
        }

        public Criteria andU_accountNotBetween(String value1, String value2) {
            addCriterion("u_account not between", value1, value2, "u_account");
            return (Criteria) this;
        }

        public Criteria andU_nameIsNull() {
            addCriterion("u_name is null");
            return (Criteria) this;
        }

        public Criteria andU_nameIsNotNull() {
            addCriterion("u_name is not null");
            return (Criteria) this;
        }

        public Criteria andU_nameEqualTo(String value) {
            addCriterion("u_name =", value, "u_name");
            return (Criteria) this;
        }

        public Criteria andU_nameNotEqualTo(String value) {
            addCriterion("u_name <>", value, "u_name");
            return (Criteria) this;
        }

        public Criteria andU_nameGreaterThan(String value) {
            addCriterion("u_name >", value, "u_name");
            return (Criteria) this;
        }

        public Criteria andU_nameGreaterThanOrEqualTo(String value) {
            addCriterion("u_name >=", value, "u_name");
            return (Criteria) this;
        }

        public Criteria andU_nameLessThan(String value) {
            addCriterion("u_name <", value, "u_name");
            return (Criteria) this;
        }

        public Criteria andU_nameLessThanOrEqualTo(String value) {
            addCriterion("u_name <=", value, "u_name");
            return (Criteria) this;
        }

        public Criteria andU_nameLike(String value) {
            addCriterion("u_name like", value, "u_name");
            return (Criteria) this;
        }

        public Criteria andU_nameNotLike(String value) {
            addCriterion("u_name not like", value, "u_name");
            return (Criteria) this;
        }

        public Criteria andU_nameIn(List<String> values) {
            addCriterion("u_name in", values, "u_name");
            return (Criteria) this;
        }

        public Criteria andU_nameNotIn(List<String> values) {
            addCriterion("u_name not in", values, "u_name");
            return (Criteria) this;
        }

        public Criteria andU_nameBetween(String value1, String value2) {
            addCriterion("u_name between", value1, value2, "u_name");
            return (Criteria) this;
        }

        public Criteria andU_nameNotBetween(String value1, String value2) {
            addCriterion("u_name not between", value1, value2, "u_name");
            return (Criteria) this;
        }

        public Criteria andU_passwordIsNull() {
            addCriterion("u_password is null");
            return (Criteria) this;
        }

        public Criteria andU_passwordIsNotNull() {
            addCriterion("u_password is not null");
            return (Criteria) this;
        }

        public Criteria andU_passwordEqualTo(String value) {
            addCriterion("u_password =", value, "u_password");
            return (Criteria) this;
        }

        public Criteria andU_passwordNotEqualTo(String value) {
            addCriterion("u_password <>", value, "u_password");
            return (Criteria) this;
        }

        public Criteria andU_passwordGreaterThan(String value) {
            addCriterion("u_password >", value, "u_password");
            return (Criteria) this;
        }

        public Criteria andU_passwordGreaterThanOrEqualTo(String value) {
            addCriterion("u_password >=", value, "u_password");
            return (Criteria) this;
        }

        public Criteria andU_passwordLessThan(String value) {
            addCriterion("u_password <", value, "u_password");
            return (Criteria) this;
        }

        public Criteria andU_passwordLessThanOrEqualTo(String value) {
            addCriterion("u_password <=", value, "u_password");
            return (Criteria) this;
        }

        public Criteria andU_passwordLike(String value) {
            addCriterion("u_password like", value, "u_password");
            return (Criteria) this;
        }

        public Criteria andU_passwordNotLike(String value) {
            addCriterion("u_password not like", value, "u_password");
            return (Criteria) this;
        }

        public Criteria andU_passwordIn(List<String> values) {
            addCriterion("u_password in", values, "u_password");
            return (Criteria) this;
        }

        public Criteria andU_passwordNotIn(List<String> values) {
            addCriterion("u_password not in", values, "u_password");
            return (Criteria) this;
        }

        public Criteria andU_passwordBetween(String value1, String value2) {
            addCriterion("u_password between", value1, value2, "u_password");
            return (Criteria) this;
        }

        public Criteria andU_passwordNotBetween(String value1, String value2) {
            addCriterion("u_password not between", value1, value2, "u_password");
            return (Criteria) this;
        }

        public Criteria andU_avatarIsNull() {
            addCriterion("u_avatar is null");
            return (Criteria) this;
        }

        public Criteria andU_avatarIsNotNull() {
            addCriterion("u_avatar is not null");
            return (Criteria) this;
        }

        public Criteria andU_avatarEqualTo(String value) {
            addCriterion("u_avatar =", value, "u_avatar");
            return (Criteria) this;
        }

        public Criteria andU_avatarNotEqualTo(String value) {
            addCriterion("u_avatar <>", value, "u_avatar");
            return (Criteria) this;
        }

        public Criteria andU_avatarGreaterThan(String value) {
            addCriterion("u_avatar >", value, "u_avatar");
            return (Criteria) this;
        }

        public Criteria andU_avatarGreaterThanOrEqualTo(String value) {
            addCriterion("u_avatar >=", value, "u_avatar");
            return (Criteria) this;
        }

        public Criteria andU_avatarLessThan(String value) {
            addCriterion("u_avatar <", value, "u_avatar");
            return (Criteria) this;
        }

        public Criteria andU_avatarLessThanOrEqualTo(String value) {
            addCriterion("u_avatar <=", value, "u_avatar");
            return (Criteria) this;
        }

        public Criteria andU_avatarLike(String value) {
            addCriterion("u_avatar like", value, "u_avatar");
            return (Criteria) this;
        }

        public Criteria andU_avatarNotLike(String value) {
            addCriterion("u_avatar not like", value, "u_avatar");
            return (Criteria) this;
        }

        public Criteria andU_avatarIn(List<String> values) {
            addCriterion("u_avatar in", values, "u_avatar");
            return (Criteria) this;
        }

        public Criteria andU_avatarNotIn(List<String> values) {
            addCriterion("u_avatar not in", values, "u_avatar");
            return (Criteria) this;
        }

        public Criteria andU_avatarBetween(String value1, String value2) {
            addCriterion("u_avatar between", value1, value2, "u_avatar");
            return (Criteria) this;
        }

        public Criteria andU_avatarNotBetween(String value1, String value2) {
            addCriterion("u_avatar not between", value1, value2, "u_avatar");
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