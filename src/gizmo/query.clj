(ns gizmo.query
  (:refer-clojure :exclude [keys])
  (:import com.tinkerpop.blueprints Query Predicate))

(defn has
  ([^Query query key]
    (.has query key))
  ([^Query query key value]
    (.has query key value))
  ([^Query query key ^Predicate predicate value]
    (.has query key predicate value)))

(defn has-not
  ([^Query query key]
    (.hasNot query key))
  ([^Query query key value]
    (.hasNot query key value)))

(defn interval
  [^Query query key startValue endValue]
  (.interval query key startValue endValue))

(defn limit
  [^Query query limit]
  (.limit query limit))

(defn edges
  [^Query query]
  (.edges query edges))

(defn vertices
  [^Query query]
  (.vertices query vertices))