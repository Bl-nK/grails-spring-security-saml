
withConfig(configuration) {
    inline(phase: 'CONVERSION') { source, context, classNode ->
        classNode.putNodeMetaData('projectVersion', '0.1')
        classNode.putNodeMetaData('projectName', 'grails-spring-security-saml')
        classNode.putNodeMetaData('isPlugin', 'true')
    }
}
