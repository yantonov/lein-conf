{:user {:dependencies [[alembic "0.3.2"]
                       [pjstadig/humane-test-output "0.6.0"]]
        :plugins [[cider/cider-nrepl "0.8.2"]
                  [lein-cljfmt "0.1.4"]
                  [refactor-nrepl "0.2.2"]
                  [lein-ancient "0.6.1"]
                  [jonase/eastwood "0.2.1"]
                  [lein-kibit "0.0.8"]]
        :injections [(use 'clojure.repl)
                     (use 'clojure.java.javadoc)
                     (require 'alembic.still)
                     (require 'pjstadig.humane-test-output)
                     (pjstadig.humane-test-output/activate!)]}}
