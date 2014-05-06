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
  "Assign a key/value property to the element.
  If a value already exists for this key, then the previous key/value is overwritten."
  [^Element element key value ]  
  (.setProperty element key value))


(defn remove-property!
  "Un-assigns a key/value property from the element.
  The object value of the removed property is returned."
  [^Element element ^String key]
  (.removeProperty element key))

(defn remove!
  "Removes the element from the graph."
  [^Element element]
  (.remove element))

(defn get-id
  "Returns an identifier that is unique. The underlying type of the identifier is 
   determined by the actual Blueprints implementation."
  [^Element element]
  (.getId element))