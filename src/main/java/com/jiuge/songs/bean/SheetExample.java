package com.jiuge.songs.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SheetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SheetExample() {
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

        public Criteria andSheet_IDIsNull() {
            addCriterion("sheet_ID is null");
            return (Criteria) this;
        }

        public Criteria andSheet_IDIsNotNull() {
            addCriterion("sheet_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSheet_IDEqualTo(Integer value) {
            addCriterion("sheet_ID =", value, "sheet_ID");
            return (Criteria) this;
        }

        public Criteria andSheet_IDNotEqualTo(Integer value) {
            addCriterion("sheet_ID <>", value, "sheet_ID");
            return (Criteria) this;
        }

        public Criteria andSheet_IDGreaterThan(Integer value) {
            addCriterion("sheet_ID >", value, "sheet_ID");
            return (Criteria) this;
        }

        public Criteria andSheet_IDGreaterThanOrEqualTo(Integer value) {
            addCriterion("sheet_ID >=", value, "sheet_ID");
            return (Criteria) this;
        }

        public Criteria andSheet_IDLessThan(Integer value) {
            addCriterion("sheet_ID <", value, "sheet_ID");
            return (Criteria) this;
        }

        public Criteria andSheet_IDLessThanOrEqualTo(Integer value) {
            addCriterion("sheet_ID <=", value, "sheet_ID");
            return (Criteria) this;
        }

        public Criteria andSheet_IDIn(List<Integer> values) {
            addCriterion("sheet_ID in", values, "sheet_ID");
            return (Criteria) this;
        }

        public Criteria andSheet_IDNotIn(List<Integer> values) {
            addCriterion("sheet_ID not in", values, "sheet_ID");
            return (Criteria) this;
        }

        public Criteria andSheet_IDBetween(Integer value1, Integer value2) {
            addCriterion("sheet_ID between", value1, value2, "sheet_ID");
            return (Criteria) this;
        }

        public Criteria andSheet_IDNotBetween(Integer value1, Integer value2) {
            addCriterion("sheet_ID not between", value1, value2, "sheet_ID");
            return (Criteria) this;
        }

        public Criteria andSh_nameIsNull() {
            addCriterion("sh_name is null");
            return (Criteria) this;
        }

        public Criteria andSh_nameIsNotNull() {
            addCriterion("sh_name is not null");
            return (Criteria) this;
        }

        public Criteria andSh_nameEqualTo(String value) {
            addCriterion("sh_name =", value, "sh_name");
            return (Criteria) this;
        }

        public Criteria andSh_nameNotEqualTo(String value) {
            addCriterion("sh_name <>", value, "sh_name");
            return (Criteria) this;
        }

        public Criteria andSh_nameGreaterThan(String value) {
            addCriterion("sh_name >", value, "sh_name");
            return (Criteria) this;
        }

        public Criteria andSh_nameGreaterThanOrEqualTo(String value) {
            addCriterion("sh_name >=", value, "sh_name");
            return (Criteria) this;
        }

        public Criteria andSh_nameLessThan(String value) {
            addCriterion("sh_name <", value, "sh_name");
            return (Criteria) this;
        }

        public Criteria andSh_nameLessThanOrEqualTo(String value) {
            addCriterion("sh_name <=", value, "sh_name");
            return (Criteria) this;
        }

        public Criteria andSh_nameLike(String value) {
            addCriterion("sh_name like", value, "sh_name");
            return (Criteria) this;
        }

        public Criteria andSh_nameNotLike(String value) {
            addCriterion("sh_name not like", value, "sh_name");
            return (Criteria) this;
        }

        public Criteria andSh_nameIn(List<String> values) {
            addCriterion("sh_name in", values, "sh_name");
            return (Criteria) this;
        }

        public Criteria andSh_nameNotIn(List<String> values) {
            addCriterion("sh_name not in", values, "sh_name");
            return (Criteria) this;
        }

        public Criteria andSh_nameBetween(String value1, String value2) {
            addCriterion("sh_name between", value1, value2, "sh_name");
            return (Criteria) this;
        }

        public Criteria andSh_nameNotBetween(String value1, String value2) {
            addCriterion("sh_name not between", value1, value2, "sh_name");
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

        public Criteria andPlayIsNull() {
            addCriterion("play is null");
            return (Criteria) this;
        }

        public Criteria andPlayIsNotNull() {
            addCriterion("play is not null");
            return (Criteria) this;
        }

        public Criteria andPlayEqualTo(Integer value) {
            addCriterion("play =", value, "play");
            return (Criteria) this;
        }

        public Criteria andPlayNotEqualTo(Integer value) {
            addCriterion("play <>", value, "play");
            return (Criteria) this;
        }

        public Criteria andPlayGreaterThan(Integer value) {
            addCriterion("play >", value, "play");
            return (Criteria) this;
        }

        public Criteria andPlayGreaterThanOrEqualTo(Integer value) {
            addCriterion("play >=", value, "play");
            return (Criteria) this;
        }

        public Criteria andPlayLessThan(Integer value) {
            addCriterion("play <", value, "play");
            return (Criteria) this;
        }

        public Criteria andPlayLessThanOrEqualTo(Integer value) {
            addCriterion("play <=", value, "play");
            return (Criteria) this;
        }

        public Criteria andPlayIn(List<Integer> values) {
            addCriterion("play in", values, "play");
            return (Criteria) this;
        }

        public Criteria andPlayNotIn(List<Integer> values) {
            addCriterion("play not in", values, "play");
            return (Criteria) this;
        }

        public Criteria andPlayBetween(Integer value1, Integer value2) {
            addCriterion("play between", value1, value2, "play");
            return (Criteria) this;
        }

        public Criteria andPlayNotBetween(Integer value1, Integer value2) {
            addCriterion("play not between", value1, value2, "play");
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

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andStyleIsNull() {
            addCriterion("style is null");
            return (Criteria) this;
        }

        public Criteria andStyleIsNotNull() {
            addCriterion("style is not null");
            return (Criteria) this;
        }

        public Criteria andStyleEqualTo(String value) {
            addCriterion("style =", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotEqualTo(String value) {
            addCriterion("style <>", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThan(String value) {
            addCriterion("style >", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThanOrEqualTo(String value) {
            addCriterion("style >=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThan(String value) {
            addCriterion("style <", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThanOrEqualTo(String value) {
            addCriterion("style <=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLike(String value) {
            addCriterion("style like", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotLike(String value) {
            addCriterion("style not like", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleIn(List<String> values) {
            addCriterion("style in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotIn(List<String> values) {
            addCriterion("style not in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleBetween(String value1, String value2) {
            addCriterion("style between", value1, value2, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotBetween(String value1, String value2) {
            addCriterion("style not between", value1, value2, "style");
            return (Criteria) this;
        }

        public Criteria andMoodIsNull() {
            addCriterion("mood is null");
            return (Criteria) this;
        }

        public Criteria andMoodIsNotNull() {
            addCriterion("mood is not null");
            return (Criteria) this;
        }

        public Criteria andMoodEqualTo(String value) {
            addCriterion("mood =", value, "mood");
            return (Criteria) this;
        }

        public Criteria andMoodNotEqualTo(String value) {
            addCriterion("mood <>", value, "mood");
            return (Criteria) this;
        }

        public Criteria andMoodGreaterThan(String value) {
            addCriterion("mood >", value, "mood");
            return (Criteria) this;
        }

        public Criteria andMoodGreaterThanOrEqualTo(String value) {
            addCriterion("mood >=", value, "mood");
            return (Criteria) this;
        }

        public Criteria andMoodLessThan(String value) {
            addCriterion("mood <", value, "mood");
            return (Criteria) this;
        }

        public Criteria andMoodLessThanOrEqualTo(String value) {
            addCriterion("mood <=", value, "mood");
            return (Criteria) this;
        }

        public Criteria andMoodLike(String value) {
            addCriterion("mood like", value, "mood");
            return (Criteria) this;
        }

        public Criteria andMoodNotLike(String value) {
            addCriterion("mood not like", value, "mood");
            return (Criteria) this;
        }

        public Criteria andMoodIn(List<String> values) {
            addCriterion("mood in", values, "mood");
            return (Criteria) this;
        }

        public Criteria andMoodNotIn(List<String> values) {
            addCriterion("mood not in", values, "mood");
            return (Criteria) this;
        }

        public Criteria andMoodBetween(String value1, String value2) {
            addCriterion("mood between", value1, value2, "mood");
            return (Criteria) this;
        }

        public Criteria andMoodNotBetween(String value1, String value2) {
            addCriterion("mood not between", value1, value2, "mood");
            return (Criteria) this;
        }

        public Criteria andSceneIsNull() {
            addCriterion("scene is null");
            return (Criteria) this;
        }

        public Criteria andSceneIsNotNull() {
            addCriterion("scene is not null");
            return (Criteria) this;
        }

        public Criteria andSceneEqualTo(String value) {
            addCriterion("scene =", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotEqualTo(String value) {
            addCriterion("scene <>", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneGreaterThan(String value) {
            addCriterion("scene >", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneGreaterThanOrEqualTo(String value) {
            addCriterion("scene >=", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneLessThan(String value) {
            addCriterion("scene <", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneLessThanOrEqualTo(String value) {
            addCriterion("scene <=", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneLike(String value) {
            addCriterion("scene like", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotLike(String value) {
            addCriterion("scene not like", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneIn(List<String> values) {
            addCriterion("scene in", values, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotIn(List<String> values) {
            addCriterion("scene not in", values, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneBetween(String value1, String value2) {
            addCriterion("scene between", value1, value2, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotBetween(String value1, String value2) {
            addCriterion("scene not between", value1, value2, "scene");
            return (Criteria) this;
        }

        public Criteria andSh_imageIsNull() {
            addCriterion("sh_image is null");
            return (Criteria) this;
        }

        public Criteria andSh_imageIsNotNull() {
            addCriterion("sh_image is not null");
            return (Criteria) this;
        }

        public Criteria andSh_imageEqualTo(String value) {
            addCriterion("sh_image =", value, "sh_image");
            return (Criteria) this;
        }

        public Criteria andSh_imageNotEqualTo(String value) {
            addCriterion("sh_image <>", value, "sh_image");
            return (Criteria) this;
        }

        public Criteria andSh_imageGreaterThan(String value) {
            addCriterion("sh_image >", value, "sh_image");
            return (Criteria) this;
        }

        public Criteria andSh_imageGreaterThanOrEqualTo(String value) {
            addCriterion("sh_image >=", value, "sh_image");
            return (Criteria) this;
        }

        public Criteria andSh_imageLessThan(String value) {
            addCriterion("sh_image <", value, "sh_image");
            return (Criteria) this;
        }

        public Criteria andSh_imageLessThanOrEqualTo(String value) {
            addCriterion("sh_image <=", value, "sh_image");
            return (Criteria) this;
        }

        public Criteria andSh_imageLike(String value) {
            addCriterion("sh_image like", value, "sh_image");
            return (Criteria) this;
        }

        public Criteria andSh_imageNotLike(String value) {
            addCriterion("sh_image not like", value, "sh_image");
            return (Criteria) this;
        }

        public Criteria andSh_imageIn(List<String> values) {
            addCriterion("sh_image in", values, "sh_image");
            return (Criteria) this;
        }

        public Criteria andSh_imageNotIn(List<String> values) {
            addCriterion("sh_image not in", values, "sh_image");
            return (Criteria) this;
        }

        public Criteria andSh_imageBetween(String value1, String value2) {
            addCriterion("sh_image between", value1, value2, "sh_image");
            return (Criteria) this;
        }

        public Criteria andSh_imageNotBetween(String value1, String value2) {
            addCriterion("sh_image not between", value1, value2, "sh_image");
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