(ns gizmo.edge
  (:import com.tinkerpop.blueprints Edge Vertex Direction))

(defn get-vertex
  [^Edge edge ^Direction direction]
  (.getVertex edge direction))

(defn get-label
  [^Edge edge]
  (.getLabel edge))