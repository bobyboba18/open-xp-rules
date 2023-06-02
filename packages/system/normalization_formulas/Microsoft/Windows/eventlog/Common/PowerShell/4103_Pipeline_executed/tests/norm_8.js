{
    "action": "execute",
    "category.generic": "Command",
    "category.high": "System Management",
    "category.low": "Manipulation",
    "chain_id": "2",
    "datafield8": "5.1.14393.3383",
    "event_src.category": "Operating system",
    "event_src.fqdn": "xxx.ru",
    "event_src.hostname": "xxx",
    "event_src.subsys": "Microsoft-Windows-PowerShell/Operational",
    "event_src.title": "windows",
    "event_src.vendor": "microsoft",
    "id": "PT_Microsoft_Windows_eventlog_Common_PowerShell_4103_pipeline_executed",
    "importance": "info",
    "msgid": "4103",
    "object": "command",
    "object.account.domain": "nt service",
    "object.account.id": "S-1-5-xxxxx",
    "object.account.name": "adsync",
    "object.process.cmdline": "\"Add-ADSyncGlobalSettingsParameter\" -GlobalSettings \"Microsoft.IdentityManagement.PowerShell.ObjectModel.GlobalSettings\" -ParameterValuesTable \"System.Collections.Hashtable\"",
    "object.process.name": "Add-ADSyncGlobalSettingsParameter",
    "object.process.parent.cmdline": "c:\\program files\\microsoft azure ad sync\\bin\\miiserver.exe",
    "object.process.parent.guid": "b134680c-9b01-46c4-b7d5-9db94ae7306b",
    "object.process.parent.id": "2720",
    "object.value": "CommandInvocation(Add-ADSyncGlobalSettingsParameter): \"Add-ADSyncGlobalSettingsParameter\"\r\nParameterBinding(Add-ADSyncGlobalSettingsParameter): name=\"GlobalSettings\"; value=\"Microsoft.IdentityManagement.PowerShell.ObjectModel.GlobalSettings\"\r\nParameterBinding(Add-ADSyncGlobalSettingsParameter): name=\"ParameterValuesTable\"; value=\"System.Collections.Hashtable\"",
    "status": "success",
    "subject": "account",
    "subject.account.domain": "nt service",
    "subject.account.id": "S-1-5-xxxxx",
    "subject.account.name": "adsync",
    "time": "2020-10-23T09:20:16.352Z"
}