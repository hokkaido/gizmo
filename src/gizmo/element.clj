(ns gizmo.element
  (:refer-clojure :exclude [keys])
  (:import com.tinkerpop.blueprints.Element))

(defn get-property
  [^Element element key]
  (.getProperty element key)) 

(defn get-property-keys
  [^Element element]
  (set (.getPropertyKeys element)))


(defn set-property!
  [^Element element key value ]  
  (.setProperty element key value))


(defn remove-property!
  [^Element element ^String key]
  (.removeProperty element key)
  element)

(defn remove!
  [^Element element]
  (.remove element))

(defn get-id
  [^Element element]
  (.getId element))