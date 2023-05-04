{
    "action": "login",
    "category.generic": "Operating System",
    "category.high": "Access Management",
    "category.low": "Communication",
    "chain_id": "18348",
    "dst.ip": "10.1.76.35",
    "event_src.category": "Operating system",
    "event_src.ip": "10.1.76.35",
    "event_src.subsys": "auditd",
    "event_src.title": "unix_like",
    "id": "PT_UNIX_like_auditd_syslog_structured_user_acct",
    "importance": "low",
    "labels": "node_contains_ext_ip",
    "logon_auth_method": "remote",
    "logon_service": "ssh",
    "msgid": "USER_ACCT",
    "object": "system",
    "object.process.fullpath": "/usr/sbin/sshd",
    "object.process.id": "41323",
    "object.process.name": "sshd",
    "object.process.path": "/usr/sbin/",
    "reason": "PAM:accounting",
    "src.ip": "192.168.206.1",
    "status": "ongoing",
    "subject": "account",
    "subject.account.name": "jr",
    "subject.state": "was-authorized",
    "time": "2020-08-21T14:56:14.000Z"
}