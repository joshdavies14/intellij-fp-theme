package com.github.joshdavies14.intellijfptheme.services

import com.github.joshdavies14.intellijfptheme.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
