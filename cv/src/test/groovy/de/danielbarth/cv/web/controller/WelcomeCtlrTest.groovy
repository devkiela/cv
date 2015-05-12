package de.danielbarth.cv.web.controller

import org.springframework.test.web.servlet.setup.MockMvcBuilders
import spock.lang.Specification

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view

class WelcomeCtlrTest extends Specification {

    def underTest = new WelcomeCtlr()

    def mockMvc = MockMvcBuilders.standaloneSetup(underTest).build()

    def 'Navigates to index page'() {

        when:
            def response = mockMvc.perform(get('/') )

        then:
            response
                .andExpect(status().isOk())
                .andExpect(view().name("index"))

    }
}