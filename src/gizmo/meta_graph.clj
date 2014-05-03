(ns gizmo.meta-graph
  (:import com.tinkerpop.blueprints MetaGraph))

(defn get-raw-graph
  [^MetaGraph graph]
  (.getRawGraph graph))