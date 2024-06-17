{"action":"alert","event_src.category":"Other","event_src.fqdn":"win10-work.stand2008.local","event_src.host":"win10-work.stand2008.local","event_src.hostname":"win10-work","event_src.id":"Microsoft-Windows-Sysmon","event_src.subsys":"Microsoft-Windows-Sysmon/Operational","event_src.title":"sysmon","event_src.vendor":"microsoft","generator.type":"logcollector","generator.version":"N26.0.2936","id":"Microsoft_Windows_eventlog_Sysmon_255_Error_report","importance":"medium","input_id":"00000000-0000-0000-0000-000000000000","mime":"application/x-pt-eventlog","msgid":"255","normalized":true,"object":"application","object.name":"DriverCommunication","reason":"Failed to retrieve events - Last error: Параметр задан неверно.","recv_ipv4":"127.0.0.1","recv_time":"2024-05-29T18:55:11.108Z","status":"success","tag":"some_tag","task_id":"00000000-0000-0000-0000-000000000000","taxonomy_version":"26.0.215-release-26.0","time":"2024-04-21T18:52:29.286Z","type":"raw","uuid":"10c30186-23a9-41d7-bb43-84abe6998b49"}
{"action":"alert","event_src.category":"Other","event_src.fqdn":"win10-work.stand2008.local","event_src.host":"win10-work.stand2008.local","event_src.hostname":"win10-work","event_src.id":"Microsoft-Windows-Sysmon","event_src.subsys":"Microsoft-Windows-Sysmon/Operational","event_src.title":"sysmon","event_src.vendor":"microsoft","generator.type":"logcollector","generator.version":"N26.0.2936","id":"Microsoft_Windows_eventlog_Sysmon_255_Error_report","importance":"medium","input_id":"00000000-0000-0000-0000-000000000000","mime":"application/x-pt-eventlog","msgid":"255","normalized":true,"object":"application","object.name":"DriverCommunication","reason":"Failed to retrieve events - Last error: Параметр задан неверно.","recv_ipv4":"127.0.0.1","recv_time":"2024-05-29T18:55:11.110Z","status":"success","tag":"some_tag","task_id":"00000000-0000-0000-0000-000000000000","taxonomy_version":"26.0.215-release-26.0","time":"2024-04-21T18:52:29.286Z","type":"raw","uuid":"1641faa9-e815-4a56-ab82-c41094b78622"}
{"action":"alert","event_src.category":"Other","event_src.fqdn":"win10-work.stand2008.local","event_src.host":"win10-work.stand2008.local","event_src.hostname":"win10-work","event_src.id":"Microsoft-Windows-Sysmon","event_src.subsys":"Microsoft-Windows-Sysmon/Operational","event_src.title":"sysmon","event_src.vendor":"microsoft","generator.type":"logcollector","generator.version":"N26.0.2936","id":"Microsoft_Windows_eventlog_Sysmon_255_Error_report","importance":"medium","input_id":"00000000-0000-0000-0000-000000000000","mime":"application/x-pt-eventlog","msgid":"255","normalized":true,"object":"application","object.name":"DriverCommunication","reason":"Failed to retrieve events - Last error: Параметр задан неверно.","recv_ipv4":"127.0.0.1","recv_time":"2024-05-29T18:55:11.110Z","status":"success","tag":"some_tag","task_id":"00000000-0000-0000-0000-000000000000","taxonomy_version":"26.0.215-release-26.0","time":"2024-04-21T18:52:29.286Z","type":"raw","uuid":"ae22cdac-0510-42cb-b0b8-179b634fe779"}

expect 1 {"action":"alert","category.generic":"Attack","category.high":"Defense Evasion","category.low":"Impair Defenses","correlation_name":"SysmonDrv_handle_hijacking","correlation_type":"incident","count":1,"event_src.category":"Host security","event_src.fqdn":"win10-work.stand2008.local","event_src.host":"win10-work.stand2008.local","event_src.hostname":"win10-work","event_src.subsys":"Microsoft-Windows-Sysmon/Operational","event_src.title":"sysmon","event_src.vendor":"microsoft","generator.type":"correlationengine","importance":"medium","incident.aggregation.key":"SysmonDrv_handle_hijacking|win10-work.stand2008.local|drivercommunication","incident.aggregation.timeout":7200,"incident.category":"ProtectionMalfunction","incident.severity":"medium","normalized":true,"object":"application","object.name":"DriverCommunication","origin_app_id":"00000000-0000-0000-0000-000000000005","primary_siem_app_id":"00000000-0000-0000-0000-000000000005","reason":"Failed to retrieve events - Last error: Параметр задан неверно.","status":"success","time":"2024-04-21T18:52:29.286Z"}