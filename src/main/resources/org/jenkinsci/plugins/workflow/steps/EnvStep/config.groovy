package org.jenkinsci.plugins.workflow.steps.EnvStep
f = namespace(lib.FormTagLib)
f.entry(field: 'overrides', title: _('Environment variable overrides')) {
    f.textarea(value: instance == null ? '' : instance.overrides.join('\n'))
}
