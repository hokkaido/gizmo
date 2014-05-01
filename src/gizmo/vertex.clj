(ns gizmo.vertex
  (:import com.tinkerpop.blueprints Vertex Direction))

(defn get-edges
  [^Vertex vertex ^Direction direction labels]
  (.getEdges vertex direction (into-array String labels)))

(defn get-vertices
  [^Vertex vertex ^Direction direction labels]
  (.getVertices vertex direction (into-array String labels)))

(defn query
  [^Vertex vertex]
  (.query vertex))

(defn add-edge!
  [^Vertex vertex ^String label ^Vertex inVertex]
  (.addEdge label inVertex))