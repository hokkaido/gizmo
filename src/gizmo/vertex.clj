(ns gizmo.vertex
  (:import (com.tinkerpop.blueprints Vertex Direction Element)))

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

;; Re-exposing Element

(defn get-property
  [^Vertex vertex key]
  (.getProperty vertex key)) 

(defn get-property-keys
  [^Vertex vertex]
  (.getPropertyKeys vertex))

(defn set-property!
  [^Vertex vertex key value ]  
  (.setProperty vertex key value))

(defn remove-property!
  [^Vertex vertex ^String key]
  (.removeProperty vertex key))

(defn remove!
  [^Vertex vertex]
  (.remove vertex))

(defn get-id
  [^Vertex vertex]
  (.getId vertex))