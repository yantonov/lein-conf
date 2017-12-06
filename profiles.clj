{:user
 {:plugins [[lein-cljfmt "0.5.7"] ; reformat
            [lein-ancient "0.6.14"] ; check out-of-date artifact
            [venantius/ultra "0.5.2"] ; pretty print test output, stacktraces
            [lein-kibit "0.1.6"] ; lint
            [jonase/eastwood "0.2.5"] ; lint
            [venantius/yagni "0.1.4"] ; check dead code
            [lein-bikeshed "0.5.0"] ; another lint tool
            [lein-auto "0.1.3"] ; watches the project source directories, and executes a task when it detects changes to files matching a set pattern
            ]
  }
 :repl
 {:dependencies [[org.clojure/tools.namespace "0.2.11"] ; reload ns
                 [alembic "0.3.2"]
                 [org.clojure/tools.nrepl "0.2.13"]
                 ]
  :plugins [[refactor-nrepl "2.3.1"]
            [cider/cider-nrepl "0.15.1"]]
  :injections [(require '[clojure.tools.namespace.repl :refer [refresh]])
               (refresh)
               (require 'alembic.still)
               (use 'clojure.repl)
               (use 'clojure.java.javadoc)]
  }}
