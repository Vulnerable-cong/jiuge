package com.jiuge.songs.bean;

import java.util.ArrayList;
import java.util.List;

public class ManagerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManagerExample() {
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

        public Criteria andManager_IDIsNull() {
            addCriterion("manager_ID is null");
            return (Criteria) this;
        }

        public Criteria andManager_IDIsNotNull() {
            addCriterion("manager_ID is not null");
            return (Criteria) this;
        }

        public Criteria andManager_IDEqualTo(Integer value) {
            addCriterion("manager_ID =", value, "manager_ID");
            return (Criteria) this;
        }

        public Criteria andManager_IDNotEqualTo(Integer value) {
            addCriterion("manager_ID <>", value, "manager_ID");
            return (Criteria) this;
        }

        public Criteria andManager_IDGreaterThan(Integer value) {
            addCriterion("manager_ID >", value, "manager_ID");
            return (Criteria) this;
        }

        public Criteria andManager_IDGreaterThanOrEqualTo(Integer value) {
            addCriterion("manager_ID >=", value, "manager_ID");
            return (Criteria) this;
        }

        public Criteria andManager_IDLessThan(Integer value) {
            addCriterion("manager_ID <", value, "manager_ID");
            return (Criteria) this;
        }

        public Criteria andManager_IDLessThanOrEqualTo(Integer value) {
            addCriterion("manager_ID <=", value, "manager_ID");
            return (Criteria) this;
        }

        public Criteria andManager_IDIn(List<Integer> values) {
            addCriterion("manager_ID in", values, "manager_ID");
            return (Criteria) this;
        }

        public Criteria andManager_IDNotIn(List<Integer> values) {
            addCriterion("manager_ID not in", values, "manager_ID");
            return (Criteria) this;
        }

        public Criteria andManager_IDBetween(Integer value1, Integer value2) {
            addCriterion("manager_ID between", value1, value2, "manager_ID");
            return (Criteria) this;
        }

        public Criteria andManager_IDNotBetween(Integer value1, Integer value2) {
            addCriterion("manager_ID not between", value1, value2, "manager_ID");
            return (Criteria) this;
        }

        public Criteria andM_accountIsNull() {
            addCriterion("m_account is null");
            return (Criteria) this;
        }

        public Criteria andM_accountIsNotNull() {
            addCriterion("m_account is not null");
            return (Criteria) this;
        }

        public Criteria andM_accountEqualTo(String value) {
            addCriterion("m_account =", value, "m_account");
            return (Criteria) this;
        }

        public Criteria andM_accountNotEqualTo(String value) {
            addCriterion("m_account <>", value, "m_account");
            return (Criteria) this;
        }

        public Criteria andM_accountGreaterThan(String value) {
            addCriterion("m_account >", value, "m_account");
            return (Criteria) this;
        }

        public Criteria andM_accountGreaterThanOrEqualTo(String value) {
            addCriterion("m_account >=", value, "m_account");
            return (Criteria) this;
        }

        public Criteria andM_accountLessThan(String value) {
            addCriterion("m_account <", value, "m_account");
            return (Criteria) this;
        }

        public Criteria andM_accountLessThanOrEqualTo(String value) {
            addCriterion("m_account <=", value, "m_account");
            return (Criteria) this;
        }

        public Criteria andM_accountLike(String value) {
            addCriterion("m_account like", value, "m_account");
            return (Criteria) this;
        }

        public Criteria andM_accountNotLike(String value) {
            addCriterion("m_account not like", value, "m_account");
            return (Criteria) this;
        }

        public Criteria andM_accountIn(List<String> values) {
            addCriterion("m_account in", values, "m_account");
            return (Criteria) this;
        }

        public Criteria andM_accountNotIn(List<String> values) {
            addCriterion("m_account not in", values, "m_account");
            return (Criteria) this;
        }

        public Criteria andM_accountBetween(String value1, String value2) {
            addCriterion("m_account between", value1, value2, "m_account");
            return (Criteria) this;
        }

        public Criteria andM_accountNotBetween(String value1, String value2) {
            addCriterion("m_account not between", value1, value2, "m_account");
            return (Criteria) this;
        }

        public Criteria andM_nameIsNull() {
            addCriterion("m_name is null");
            return (Criteria) this;
        }

        public Criteria andM_nameIsNotNull() {
            addCriterion("m_name is not null");
            return (Criteria) this;
        }

        public Criteria andM_nameEqualTo(String value) {
            addCriterion("m_name =", value, "m_name");
            return (Criteria) this;
        }

        public Criteria andM_nameNotEqualTo(String value) {
            addCriterion("m_name <>", value, "m_name");
            return (Criteria) this;
        }

        public Criteria andM_nameGreaterThan(String value) {
            addCriterion("m_name >", value, "m_name");
            return (Criteria) this;
        }

        public Criteria andM_nameGreaterThanOrEqualTo(String value) {
            addCriterion("m_name >=", value, "m_name");
            return (Criteria) this;
        }

        public Criteria andM_nameLessThan(String value) {
            addCriterion("m_name <", value, "m_name");
            return (Criteria) this;
        }

        public Criteria andM_nameLessThanOrEqualTo(String value) {
            addCriterion("m_name <=", value, "m_name");
            return (Criteria) this;
        }

        public Criteria andM_nameLike(String value) {
            addCriterion("m_name like", value, "m_name");
            return (Criteria) this;
        }

        public Criteria andM_nameNotLike(String value) {
            addCriterion("m_name not like", value, "m_name");
            return (Criteria) this;
        }

        public Criteria andM_nameIn(List<String> values) {
            addCriterion("m_name in", values, "m_name");
            return (Criteria) this;
        }

        public Criteria andM_nameNotIn(List<String> values) {
            addCriterion("m_name not in", values, "m_name");
            return (Criteria) this;
        }

        public Criteria andM_nameBetween(String value1, String value2) {
            addCriterion("m_name between", value1, value2, "m_name");
            return (Criteria) this;
        }

        public Criteria andM_nameNotBetween(String value1, String value2) {
            addCriterion("m_name not between", value1, value2, "m_name");
            return (Criteria) this;
        }

        public Criteria andM_passwordIsNull() {
            addCriterion("m_password is null");
            return (Criteria) this;
        }

        public Criteria andM_passwordIsNotNull() {
            addCriterion("m_password is not null");
            return (Criteria) this;
        }

        public Criteria andM_passwordEqualTo(String value) {
            addCriterion("m_password =", value, "m_password");
            return (Criteria) this;
        }

        public Criteria andM_passwordNotEqualTo(String value) {
            addCriterion("m_password <>", value, "m_password");
            return (Criteria) this;
        }

        public Criteria andM_passwordGreaterThan(String value) {
            addCriterion("m_password >", value, "m_password");
            return (Criteria) this;
        }

        public Criteria andM_passwordGreaterThanOrEqualTo(String value) {
            addCriterion("m_password >=", value, "m_password");
            return (Criteria) this;
        }

        public Criteria andM_passwordLessThan(String value) {
            addCriterion("m_password <", value, "m_password");
            return (Criteria) this;
        }

        public Criteria andM_passwordLessThanOrEqualTo(String value) {
            addCriterion("m_password <=", value, "m_password");
            return (Criteria) this;
        }

        public Criteria andM_passwordLike(String value) {
            addCriterion("m_password like", value, "m_password");
            return (Criteria) this;
        }

        public Criteria andM_passwordNotLike(String value) {
            addCriterion("m_password not like", value, "m_password");
            return (Criteria) this;
        }

        public Criteria andM_passwordIn(List<String> values) {
            addCriterion("m_password in", values, "m_password");
            return (Criteria) this;
        }

        public Criteria andM_passwordNotIn(List<String> values) {
            addCriterion("m_password not in", values, "m_password");
            return (Criteria) this;
        }

        public Criteria andM_passwordBetween(String value1, String value2) {
            addCriterion("m_password between", value1, value2, "m_password");
            return (Criteria) this;
        }

        public Criteria andM_passwordNotBetween(String value1, String value2) {
            addCriterion("m_password not between", value1, value2, "m_password");
            return (Criteria) this;
        }

        public Criteria andM_avatarIsNull() {
            addCriterion("m_avatar is null");
            return (Criteria) this;
        }

        public Criteria andM_avatarIsNotNull() {
            addCriterion("m_avatar is not null");
            return (Criteria) this;
        }

        public Criteria andM_avatarEqualTo(String value) {
            addCriterion("m_avatar =", value, "m_avatar");
            return (Criteria) this;
        }

        public Criteria andM_avatarNotEqualTo(String value) {
            addCriterion("m_avatar <>", value, "m_avatar");
            return (Criteria) this;
        }

        public Criteria andM_avatarGreaterThan(String value) {
            addCriterion("m_avatar >", value, "m_avatar");
            return (Criteria) this;
        }

        public Criteria andM_avatarGreaterThanOrEqualTo(String value) {
            addCriterion("m_avatar >=", value, "m_avatar");
            return (Criteria) this;
        }

        public Criteria andM_avatarLessThan(String value) {
            addCriterion("m_avatar <", value, "m_avatar");
            return (Criteria) this;
        }

        public Criteria andM_avatarLessThanOrEqualTo(String value) {
            addCriterion("m_avatar <=", value, "m_avatar");
            return (Criteria) this;
        }

        public Criteria andM_avatarLike(String value) {
            addCriterion("m_avatar like", value, "m_avatar");
            return (Criteria) this;
        }

        public Criteria andM_avatarNotLike(String value) {
            addCriterion("m_avatar not like", value, "m_avatar");
            return (Criteria) this;
        }

        public Criteria andM_avatarIn(List<String> values) {
            addCriterion("m_avatar in", values, "m_avatar");
            return (Criteria) this;
        }

        public Criteria andM_avatarNotIn(List<String> values) {
            addCriterion("m_avatar not in", values, "m_avatar");
            return (Criteria) this;
        }

        public Criteria andM_avatarBetween(String value1, String value2) {
            addCriterion("m_avatar between", value1, value2, "m_avatar");
            return (Criteria) this;
        }

        public Criteria andM_avatarNotBetween(String value1, String value2) {
            addCriterion("m_avatar not between", value1, value2, "m_avatar");
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