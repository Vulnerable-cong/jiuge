package com.jiuge.songs.bean;

import java.util.ArrayList;
import java.util.List;

public class AlbumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlbumExample() {
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

        public Criteria andAlbum_IDIsNull() {
            addCriterion("album_ID is null");
            return (Criteria) this;
        }

        public Criteria andAlbum_IDIsNotNull() {
            addCriterion("album_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAlbum_IDEqualTo(Integer value) {
            addCriterion("album_ID =", value, "album_ID");
            return (Criteria) this;
        }

        public Criteria andAlbum_IDNotEqualTo(Integer value) {
            addCriterion("album_ID <>", value, "album_ID");
            return (Criteria) this;
        }

        public Criteria andAlbum_IDGreaterThan(Integer value) {
            addCriterion("album_ID >", value, "album_ID");
            return (Criteria) this;
        }

        public Criteria andAlbum_IDGreaterThanOrEqualTo(Integer value) {
            addCriterion("album_ID >=", value, "album_ID");
            return (Criteria) this;
        }

        public Criteria andAlbum_IDLessThan(Integer value) {
            addCriterion("album_ID <", value, "album_ID");
            return (Criteria) this;
        }

        public Criteria andAlbum_IDLessThanOrEqualTo(Integer value) {
            addCriterion("album_ID <=", value, "album_ID");
            return (Criteria) this;
        }

        public Criteria andAlbum_IDIn(List<Integer> values) {
            addCriterion("album_ID in", values, "album_ID");
            return (Criteria) this;
        }

        public Criteria andAlbum_IDNotIn(List<Integer> values) {
            addCriterion("album_ID not in", values, "album_ID");
            return (Criteria) this;
        }

        public Criteria andAlbum_IDBetween(Integer value1, Integer value2) {
            addCriterion("album_ID between", value1, value2, "album_ID");
            return (Criteria) this;
        }

        public Criteria andAlbum_IDNotBetween(Integer value1, Integer value2) {
            addCriterion("album_ID not between", value1, value2, "album_ID");
            return (Criteria) this;
        }

        public Criteria andA_nameIsNull() {
            addCriterion("a_name is null");
            return (Criteria) this;
        }

        public Criteria andA_nameIsNotNull() {
            addCriterion("a_name is not null");
            return (Criteria) this;
        }

        public Criteria andA_nameEqualTo(String value) {
            addCriterion("a_name =", value, "a_name");
            return (Criteria) this;
        }

        public Criteria andA_nameNotEqualTo(String value) {
            addCriterion("a_name <>", value, "a_name");
            return (Criteria) this;
        }

        public Criteria andA_nameGreaterThan(String value) {
            addCriterion("a_name >", value, "a_name");
            return (Criteria) this;
        }

        public Criteria andA_nameGreaterThanOrEqualTo(String value) {
            addCriterion("a_name >=", value, "a_name");
            return (Criteria) this;
        }

        public Criteria andA_nameLessThan(String value) {
            addCriterion("a_name <", value, "a_name");
            return (Criteria) this;
        }

        public Criteria andA_nameLessThanOrEqualTo(String value) {
            addCriterion("a_name <=", value, "a_name");
            return (Criteria) this;
        }

        public Criteria andA_nameLike(String value) {
            addCriterion("a_name like", value, "a_name");
            return (Criteria) this;
        }

        public Criteria andA_nameNotLike(String value) {
            addCriterion("a_name not like", value, "a_name");
            return (Criteria) this;
        }

        public Criteria andA_nameIn(List<String> values) {
            addCriterion("a_name in", values, "a_name");
            return (Criteria) this;
        }

        public Criteria andA_nameNotIn(List<String> values) {
            addCriterion("a_name not in", values, "a_name");
            return (Criteria) this;
        }

        public Criteria andA_nameBetween(String value1, String value2) {
            addCriterion("a_name between", value1, value2, "a_name");
            return (Criteria) this;
        }

        public Criteria andA_nameNotBetween(String value1, String value2) {
            addCriterion("a_name not between", value1, value2, "a_name");
            return (Criteria) this;
        }

        public Criteria andA_imageIsNull() {
            addCriterion("a_image is null");
            return (Criteria) this;
        }

        public Criteria andA_imageIsNotNull() {
            addCriterion("a_image is not null");
            return (Criteria) this;
        }

        public Criteria andA_imageEqualTo(String value) {
            addCriterion("a_image =", value, "a_image");
            return (Criteria) this;
        }

        public Criteria andA_imageNotEqualTo(String value) {
            addCriterion("a_image <>", value, "a_image");
            return (Criteria) this;
        }

        public Criteria andA_imageGreaterThan(String value) {
            addCriterion("a_image >", value, "a_image");
            return (Criteria) this;
        }

        public Criteria andA_imageGreaterThanOrEqualTo(String value) {
            addCriterion("a_image >=", value, "a_image");
            return (Criteria) this;
        }

        public Criteria andA_imageLessThan(String value) {
            addCriterion("a_image <", value, "a_image");
            return (Criteria) this;
        }

        public Criteria andA_imageLessThanOrEqualTo(String value) {
            addCriterion("a_image <=", value, "a_image");
            return (Criteria) this;
        }

        public Criteria andA_imageLike(String value) {
            addCriterion("a_image like", value, "a_image");
            return (Criteria) this;
        }

        public Criteria andA_imageNotLike(String value) {
            addCriterion("a_image not like", value, "a_image");
            return (Criteria) this;
        }

        public Criteria andA_imageIn(List<String> values) {
            addCriterion("a_image in", values, "a_image");
            return (Criteria) this;
        }

        public Criteria andA_imageNotIn(List<String> values) {
            addCriterion("a_image not in", values, "a_image");
            return (Criteria) this;
        }

        public Criteria andA_imageBetween(String value1, String value2) {
            addCriterion("a_image between", value1, value2, "a_image");
            return (Criteria) this;
        }

        public Criteria andA_imageNotBetween(String value1, String value2) {
            addCriterion("a_image not between", value1, value2, "a_image");
            return (Criteria) this;
        }

        public Criteria andA_languageIsNull() {
            addCriterion("a_language is null");
            return (Criteria) this;
        }

        public Criteria andA_languageIsNotNull() {
            addCriterion("a_language is not null");
            return (Criteria) this;
        }

        public Criteria andA_languageEqualTo(String value) {
            addCriterion("a_language =", value, "a_language");
            return (Criteria) this;
        }

        public Criteria andA_languageNotEqualTo(String value) {
            addCriterion("a_language <>", value, "a_language");
            return (Criteria) this;
        }

        public Criteria andA_languageGreaterThan(String value) {
            addCriterion("a_language >", value, "a_language");
            return (Criteria) this;
        }

        public Criteria andA_languageGreaterThanOrEqualTo(String value) {
            addCriterion("a_language >=", value, "a_language");
            return (Criteria) this;
        }

        public Criteria andA_languageLessThan(String value) {
            addCriterion("a_language <", value, "a_language");
            return (Criteria) this;
        }

        public Criteria andA_languageLessThanOrEqualTo(String value) {
            addCriterion("a_language <=", value, "a_language");
            return (Criteria) this;
        }

        public Criteria andA_languageLike(String value) {
            addCriterion("a_language like", value, "a_language");
            return (Criteria) this;
        }

        public Criteria andA_languageNotLike(String value) {
            addCriterion("a_language not like", value, "a_language");
            return (Criteria) this;
        }

        public Criteria andA_languageIn(List<String> values) {
            addCriterion("a_language in", values, "a_language");
            return (Criteria) this;
        }

        public Criteria andA_languageNotIn(List<String> values) {
            addCriterion("a_language not in", values, "a_language");
            return (Criteria) this;
        }

        public Criteria andA_languageBetween(String value1, String value2) {
            addCriterion("a_language between", value1, value2, "a_language");
            return (Criteria) this;
        }

        public Criteria andA_languageNotBetween(String value1, String value2) {
            addCriterion("a_language not between", value1, value2, "a_language");
            return (Criteria) this;
        }

        public Criteria andA_styleIsNull() {
            addCriterion("a_style is null");
            return (Criteria) this;
        }

        public Criteria andA_styleIsNotNull() {
            addCriterion("a_style is not null");
            return (Criteria) this;
        }

        public Criteria andA_styleEqualTo(String value) {
            addCriterion("a_style =", value, "a_style");
            return (Criteria) this;
        }

        public Criteria andA_styleNotEqualTo(String value) {
            addCriterion("a_style <>", value, "a_style");
            return (Criteria) this;
        }

        public Criteria andA_styleGreaterThan(String value) {
            addCriterion("a_style >", value, "a_style");
            return (Criteria) this;
        }

        public Criteria andA_styleGreaterThanOrEqualTo(String value) {
            addCriterion("a_style >=", value, "a_style");
            return (Criteria) this;
        }

        public Criteria andA_styleLessThan(String value) {
            addCriterion("a_style <", value, "a_style");
            return (Criteria) this;
        }

        public Criteria andA_styleLessThanOrEqualTo(String value) {
            addCriterion("a_style <=", value, "a_style");
            return (Criteria) this;
        }

        public Criteria andA_styleLike(String value) {
            addCriterion("a_style like", value, "a_style");
            return (Criteria) this;
        }

        public Criteria andA_styleNotLike(String value) {
            addCriterion("a_style not like", value, "a_style");
            return (Criteria) this;
        }

        public Criteria andA_styleIn(List<String> values) {
            addCriterion("a_style in", values, "a_style");
            return (Criteria) this;
        }

        public Criteria andA_styleNotIn(List<String> values) {
            addCriterion("a_style not in", values, "a_style");
            return (Criteria) this;
        }

        public Criteria andA_styleBetween(String value1, String value2) {
            addCriterion("a_style between", value1, value2, "a_style");
            return (Criteria) this;
        }

        public Criteria andA_styleNotBetween(String value1, String value2) {
            addCriterion("a_style not between", value1, value2, "a_style");
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