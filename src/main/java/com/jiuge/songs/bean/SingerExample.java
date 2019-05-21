package com.jiuge.songs.bean;

import java.util.ArrayList;
import java.util.List;

public class SingerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SingerExample() {
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

        public Criteria andSinger_IDIsNull() {
            addCriterion("singer_ID is null");
            return (Criteria) this;
        }

        public Criteria andSinger_IDIsNotNull() {
            addCriterion("singer_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSinger_IDEqualTo(Integer value) {
            addCriterion("singer_ID =", value, "singer_ID");
            return (Criteria) this;
        }

        public Criteria andSinger_IDNotEqualTo(Integer value) {
            addCriterion("singer_ID <>", value, "singer_ID");
            return (Criteria) this;
        }

        public Criteria andSinger_IDGreaterThan(Integer value) {
            addCriterion("singer_ID >", value, "singer_ID");
            return (Criteria) this;
        }

        public Criteria andSinger_IDGreaterThanOrEqualTo(Integer value) {
            addCriterion("singer_ID >=", value, "singer_ID");
            return (Criteria) this;
        }

        public Criteria andSinger_IDLessThan(Integer value) {
            addCriterion("singer_ID <", value, "singer_ID");
            return (Criteria) this;
        }

        public Criteria andSinger_IDLessThanOrEqualTo(Integer value) {
            addCriterion("singer_ID <=", value, "singer_ID");
            return (Criteria) this;
        }

        public Criteria andSinger_IDIn(List<Integer> values) {
            addCriterion("singer_ID in", values, "singer_ID");
            return (Criteria) this;
        }

        public Criteria andSinger_IDNotIn(List<Integer> values) {
            addCriterion("singer_ID not in", values, "singer_ID");
            return (Criteria) this;
        }

        public Criteria andSinger_IDBetween(Integer value1, Integer value2) {
            addCriterion("singer_ID between", value1, value2, "singer_ID");
            return (Criteria) this;
        }

        public Criteria andSinger_IDNotBetween(Integer value1, Integer value2) {
            addCriterion("singer_ID not between", value1, value2, "singer_ID");
            return (Criteria) this;
        }

        public Criteria andSi_nameIsNull() {
            addCriterion("si_name is null");
            return (Criteria) this;
        }

        public Criteria andSi_nameIsNotNull() {
            addCriterion("si_name is not null");
            return (Criteria) this;
        }

        public Criteria andSi_nameEqualTo(String value) {
            addCriterion("si_name =", value, "si_name");
            return (Criteria) this;
        }

        public Criteria andSi_nameNotEqualTo(String value) {
            addCriterion("si_name <>", value, "si_name");
            return (Criteria) this;
        }

        public Criteria andSi_nameGreaterThan(String value) {
            addCriterion("si_name >", value, "si_name");
            return (Criteria) this;
        }

        public Criteria andSi_nameGreaterThanOrEqualTo(String value) {
            addCriterion("si_name >=", value, "si_name");
            return (Criteria) this;
        }

        public Criteria andSi_nameLessThan(String value) {
            addCriterion("si_name <", value, "si_name");
            return (Criteria) this;
        }

        public Criteria andSi_nameLessThanOrEqualTo(String value) {
            addCriterion("si_name <=", value, "si_name");
            return (Criteria) this;
        }

        public Criteria andSi_nameLike(String value) {
            addCriterion("si_name like", value, "si_name");
            return (Criteria) this;
        }

        public Criteria andSi_nameNotLike(String value) {
            addCriterion("si_name not like", value, "si_name");
            return (Criteria) this;
        }

        public Criteria andSi_nameIn(List<String> values) {
            addCriterion("si_name in", values, "si_name");
            return (Criteria) this;
        }

        public Criteria andSi_nameNotIn(List<String> values) {
            addCriterion("si_name not in", values, "si_name");
            return (Criteria) this;
        }

        public Criteria andSi_nameBetween(String value1, String value2) {
            addCriterion("si_name between", value1, value2, "si_name");
            return (Criteria) this;
        }

        public Criteria andSi_nameNotBetween(String value1, String value2) {
            addCriterion("si_name not between", value1, value2, "si_name");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andSi_imageIsNull() {
            addCriterion("si_image is null");
            return (Criteria) this;
        }

        public Criteria andSi_imageIsNotNull() {
            addCriterion("si_image is not null");
            return (Criteria) this;
        }

        public Criteria andSi_imageEqualTo(String value) {
            addCriterion("si_image =", value, "si_image");
            return (Criteria) this;
        }

        public Criteria andSi_imageNotEqualTo(String value) {
            addCriterion("si_image <>", value, "si_image");
            return (Criteria) this;
        }

        public Criteria andSi_imageGreaterThan(String value) {
            addCriterion("si_image >", value, "si_image");
            return (Criteria) this;
        }

        public Criteria andSi_imageGreaterThanOrEqualTo(String value) {
            addCriterion("si_image >=", value, "si_image");
            return (Criteria) this;
        }

        public Criteria andSi_imageLessThan(String value) {
            addCriterion("si_image <", value, "si_image");
            return (Criteria) this;
        }

        public Criteria andSi_imageLessThanOrEqualTo(String value) {
            addCriterion("si_image <=", value, "si_image");
            return (Criteria) this;
        }

        public Criteria andSi_imageLike(String value) {
            addCriterion("si_image like", value, "si_image");
            return (Criteria) this;
        }

        public Criteria andSi_imageNotLike(String value) {
            addCriterion("si_image not like", value, "si_image");
            return (Criteria) this;
        }

        public Criteria andSi_imageIn(List<String> values) {
            addCriterion("si_image in", values, "si_image");
            return (Criteria) this;
        }

        public Criteria andSi_imageNotIn(List<String> values) {
            addCriterion("si_image not in", values, "si_image");
            return (Criteria) this;
        }

        public Criteria andSi_imageBetween(String value1, String value2) {
            addCriterion("si_image between", value1, value2, "si_image");
            return (Criteria) this;
        }

        public Criteria andSi_imageNotBetween(String value1, String value2) {
            addCriterion("si_image not between", value1, value2, "si_image");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andLabelIsNull() {
            addCriterion("label is null");
            return (Criteria) this;
        }

        public Criteria andLabelIsNotNull() {
            addCriterion("label is not null");
            return (Criteria) this;
        }

        public Criteria andLabelEqualTo(String value) {
            addCriterion("label =", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotEqualTo(String value) {
            addCriterion("label <>", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThan(String value) {
            addCriterion("label >", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThanOrEqualTo(String value) {
            addCriterion("label >=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThan(String value) {
            addCriterion("label <", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThanOrEqualTo(String value) {
            addCriterion("label <=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLike(String value) {
            addCriterion("label like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotLike(String value) {
            addCriterion("label not like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelIn(List<String> values) {
            addCriterion("label in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotIn(List<String> values) {
            addCriterion("label not in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelBetween(String value1, String value2) {
            addCriterion("label between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotBetween(String value1, String value2) {
            addCriterion("label not between", value1, value2, "label");
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