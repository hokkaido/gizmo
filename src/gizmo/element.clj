(ns gizmo.element
  (:refer-clojure :exclude [keys])
  (:import com.tinkerpop.blueprints.Element))

(defn get-property
  "Return the object value associated with the provided string key.
  If no value exists for that key, return nil"
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
  "Removes the element from the graph."
  [^Element element]
  (.remove element))

(defn get-id
  "Returns an identifier that is unique."
  [^Element element]
  (.getId element))