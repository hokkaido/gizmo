# gizmo
Gizmo is a transparent wrapper for Tinkerpop Blueprints. This library doesn't introduce new functionality when it comes to the Blueprints API.

## Gotchas
The aim of this library is to provide a *transparent* wrapper for the Tinkerpop Blueprints API. What does this mean? A short example:

Blueprint's Graph interface defines a method called getVertices which returns an Iterable<Vertex>. 

```
public Iterable<Vertex> getVertices();
```

Our wrapper function does *not* coerce this into a Clojure set or seq:

```
(defn get-vertices
  "Returns an iterable to all the vertices in the graph.
  * If this is not possible for the implementation, then an UnsupportedOperationException can be thrown."
  ([^Graph graph] 
    (.getVertices graph))
```

## License

