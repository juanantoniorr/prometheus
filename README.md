# Prometheus
App that integrates prometheus and grafana

Test custom metric: http://localhost:8080/test/metrics
Default endpoint: http://localhost:8080/actuator
Docker command: docker run -p 9090:9090 -v C:\Users\Juan\OneDrive\Escritorio\workspaceMetrics\prometheus\.yml:/etc/prometheus/prometheus.yml prom/prometheus
Docker endpoint: http://localhost:9090

First we have to invoke custom metrics endpoint in order to add the new metric to prometheus.
