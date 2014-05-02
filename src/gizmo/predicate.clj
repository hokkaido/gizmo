(ns gizmo.graph-query
  (:refer-clojure :exclude [first second])
  (:import com.tinkerpop.blueprints.Predicate))

(defn evaluate
  [^Predicate predicate first second]
  (.evaluate predicate first second))