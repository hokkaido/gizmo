(ns gizmo.graph-query
  (:refer-clojure :exclude [keys])
  (:import com.tinkerpop.blueprints Query GraphQuery Predicate))

(defn has
  ([^GraphQuery graphQuery key]
    (.has graphQuery key))
  ([^GraphQuery graphQuery key value]
    (.has graphQuery key value))
  ([^GraphQuery graphQuery key predicate value]
    (.has graphQuery key ^Predicate predicate value)))

(defn hasNot
  ([^GraphQuery graphQuery key]
    (.hasNot graphQuery key))
  ([^GraphQuery graphQuery key value]
    (.hasNot graphQuery key value)))

(defn limit
  [^GraphQuery graphQuery limit]
  (.limit graphQuery limit))



