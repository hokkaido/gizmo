(ns gizmo.index
  (:refer-clojure :exclude [keys get count])
  (:import com.tinkerpop.blueprints Index Element))

(defn get-index-name
  [^Index idx]
  (.getIndexName idx))

(defn get-index-class
  [^Index idx]
  (.getIndexClass idx))

(defn put!
  [^Index idx key value element]
  (.put idx key value element))

(defn get
  [^Index idx key value]
  (.get idx key value))

(defn query
  [^Index idx key query]
  (.get idx key query))

(defn count
  [^Index idx key value]
  (.get idx key value))

(defn remove!
  [^Index idx key value element]
  (.get idx key value element))



