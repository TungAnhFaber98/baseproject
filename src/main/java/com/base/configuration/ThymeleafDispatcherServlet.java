package com.base.configuration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author TungAnhFaber
 * @email phamtunganh@fabercompany.co.jp
 */
public class ThymeleafDispatcherServlet extends DispatcherServlet {

    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    @Override
    protected void render(ModelAndView mv, HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            super.render(mv, request, response);
        } catch (Exception ex) {
            LOGGER.error(ExceptionUtils.getStackTrace(ex));
            throw new Exception();
        }

    }
}
