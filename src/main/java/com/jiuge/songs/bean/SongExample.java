package com.jiuge.songs.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SongExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SongExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
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

        public Criteria andS_nameIsNull() {
            addCriterion("s_name is null");
            return (Criteria) this;
        }

        public Criteria andS_nameIsNotNull() {
            addCriterion("s_name is not null");
            return (Criteria) this;
        }

        public Criteria andS_nameEqualTo(String value) {
            addCriterion("s_name =", value, "s_name");
            return (Criteria) this;
        }

        public Criteria andS_nameNotEqualTo(String value) {
            addCriterion("s_name <>", value, "s_name");
            return (Criteria) this;
        }

        public Criteria andS_nameGreaterThan(String value) {
            addCriterion("s_name >", value, "s_name");
            return (Criteria) this;
        }

        public Criteria andS_nameGreaterThanOrEqualTo(String value) {
            addCriterion("s_name >=", value, "s_name");
            return (Criteria) this;
        }

        public Criteria andS_nameLessThan(String value) {
            addCriterion("s_name <", value, "s_name");
            return (Criteria) this;
        }

        public Criteria andS_nameLessThanOrEqualTo(String value) {
            addCriterion("s_name <=", value, "s_name");
            return (Criteria) this;
        }

        public Criteria andS_nameLike(String value) {
            addCriterion("s_name like", value, "s_name");
            return (Criteria) this;
        }

        public Criteria andS_nameNotLike(String value) {
            addCriterion("s_name not like", value, "s_name");
            return (Criteria) this;
        }

        public Criteria andS_nameIn(List<String> values) {
            addCriterion("s_name in", values, "s_name");
            return (Criteria) this;
        }

        public Criteria andS_nameNotIn(List<String> values) {
            addCriterion("s_name not in", values, "s_name");
            return (Criteria) this;
        }

        public Criteria andS_nameBetween(String value1, String value2) {
            addCriterion("s_name between", value1, value2, "s_name");
            return (Criteria) this;
        }

        public Criteria andS_nameNotBetween(String value1, String value2) {
            addCriterion("s_name not between", value1, value2, "s_name");
            return (Criteria) this;
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

        public Criteria andFileIsNull() {
            addCriterion("file is null");
            return (Criteria) this;
        }

        public Criteria andFileIsNotNull() {
            addCriterion("file is not null");
            return (Criteria) this;
        }

        public Criteria andFileEqualTo(String value) {
            addCriterion("file =", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileNotEqualTo(String value) {
            addCriterion("file <>", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileGreaterThan(String value) {
            addCriterion("file >", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileGreaterThanOrEqualTo(String value) {
            addCriterion("file >=", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileLessThan(String value) {
            addCriterion("file <", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileLessThanOrEqualTo(String value) {
            addCriterion("file <=", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileLike(String value) {
            addCriterion("file like", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileNotLike(String value) {
            addCriterion("file not like", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileIn(List<String> values) {
            addCriterion("file in", values, "file");
            return (Criteria) this;
        }

        public Criteria andFileNotIn(List<String> values) {
            addCriterion("file not in", values, "file");
            return (Criteria) this;
        }

        public Criteria andFileBetween(String value1, String value2) {
            addCriterion("file between", value1, value2, "file");
            return (Criteria) this;
        }

        public Criteria andFileNotBetween(String value1, String value2) {
            addCriterion("file not between", value1, value2, "file");
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

        public Criteria andDurationIsNull() {
            addCriterion("duration is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("duration is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(Date value) {
            addCriterionForJDBCTime("duration =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(Date value) {
            addCriterionForJDBCTime("duration <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(Date value) {
            addCriterionForJDBCTime("duration >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("duration >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(Date value) {
            addCriterionForJDBCTime("duration <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("duration <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<Date> values) {
            addCriterionForJDBCTime("duration in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<Date> values) {
            addCriterionForJDBCTime("duration not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("duration between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("duration not between", value1, value2, "duration");
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