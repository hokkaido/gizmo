(ns gizmo.graph-query
  (:import com.tinkerpop.blueprints.Predicate))

(defn evaluate
  [^Predicate predicate first second]
  (.evaluate predicate first second))