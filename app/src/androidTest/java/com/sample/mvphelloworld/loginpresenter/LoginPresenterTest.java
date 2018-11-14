package com.sample.mvphelloworld.loginpresenter;

import com.sample.mvphelloworld.logincontracter.LoginContracter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;

import javax.annotation.meta.When;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LoginPresenterTest {

    @Mock
    private LoginContracter.View view;
    @Mock
    private LoginPresenter presenter;
    @Before
    public void setUp() throws Exception {
        presenter=new LoginPresenter(view);
    }
    @After
    public void tearDown() throws Exception {

    }
    @Test
    public void showErrorMessageWhenUserNameIsEmpty()throws Exception{
        when(view.getUsername()).thenReturn("");
        presenter.loginCheck("","");
        verify(view).usernameValidation("UN Not found");

    }
    @Test
    public void showErrorMessageWhenPasswordIsEmpty()throws Exception{
        when(view.getUsername()).thenReturn("koti");
        when(view.getPassword()).thenReturn("");
        presenter.loginCheck("","");
        verify(view).passwordValidation("Pass Not Fund");

    }

    @Test
    public void CheckBothUserNameAndPassworAreCorrect() {
        when(view.getUsername()).thenReturn("koti");
        when(view.getPassword()).thenReturn("123");
        presenter.loginCheck("","");
        verify(view).showLoginSucessMessage("Login Success");
    }
    @Test
    public void CheckBothWrongCredentials() {
        when(view.getUsername()).thenReturn("134");
        when(view.getPassword()).thenReturn("333");
        presenter.loginCheck("","");
        verify(view).showLoginFailureMessage("wrong credentials ");
    }

}