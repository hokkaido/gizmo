(ns gizmo.edge
  (:import (com.tinkerpop.blueprints Edge Vertex Direction)))

(defn get-vertex
  [^Edge edge ^Direction direction]
  (.getVertex edge direction))

(defn get-label
  [^Edge edge]
  (.getLabel edge))

(defn get-property
  [^Edge edge key]
  (.getProperty edge key))

(defn get-property-keys
  [^Edge edge]
  (set (.getPropertyKeys edge)))

(defn set-property!
  [^Edge edge key value ]  
  (.setProperty edge key value))

(defn remove-property!
  [^Edge edge ^String key]
  (.removeProperty edge key))

(defn remove!
  [^Edge edge]
  (.remove edge))

(defn get-id
  [^Edge edge]
  (.getId edge)