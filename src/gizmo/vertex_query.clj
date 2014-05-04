(ns gizmo.vertex-query
  (:refer-clojure :exclude [count])
  (:import (com.tinkerpop.blueprints VertexQuery Direction)))

(defn direction
  [^VertexQuery query ^Direction direction]
  (.direction query direction))

(defn labels
  [^VertexQuery query labels]
  (.labels query (into-array String labels)))

(defn count
  [^VertexQuery query]
  (.labels query count))

(defn vertex-ids
  [^VertexQuery query]
  (.vertexIds query))