package com.tiyujia.homesport.entity;

import com.tiyujia.homesport.App;
import com.tiyujia.homesport.entity.Result;
import com.tiyujia.homesport.entity.UserApi;
import com.tiyujia.homesport.entity.UserData;
import com.tiyujia.homesport.entity.UserService;
import com.tiyujia.homesport.entity.VerifyCode;
import com.tiyujia.homesport.util.RetrofitUtil;

import java.io.File;
import java.util.HashMap;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import rx.Observable;

/**
 * Created by zzqybyb19860112 on 2016/11/10.1
 */

public class UserServiceImpl implements UserService {
    UserApi api;
    public UserServiceImpl() {
        api = RetrofitUtil.createApi(App.getContext(), UserApi.class);
    }
    @Override public Observable<Result> getVerifyCode(String phone) {
        HashMap<String, String> params = new HashMap<>();
        params.put("phone", phone);
        return api.getVerifyCode(params);
    }
    @Override public Observable<Result<VerifyCode>> verifyPhone(String phone, String code) {
        HashMap<String, String> params = new HashMap<>();
        params.put("phone", phone);
        params.put("code", code);
        return api.verifyPhone(params);
    }
    @Override
    public Observable<Result> register(String phone, String pwd, String nickname, String avatar) {
        HashMap<String, RequestBody> params = new HashMap<>();
        params.put("phone", RequestBody.create(MediaType.parse("text/plain"), phone));
        params.put("pwd", RequestBody.create(MediaType.parse("text/plain"), pwd));
        params.put("nickname", RequestBody.create(MediaType.parse("text/plain"), nickname));
        if (avatar != null) {
            params.put("avatar", RequestBody.create(MediaType.parse("image/*"), new File(avatar)));
        }
        return api.register(params);
    }
    @Override public Observable<Result> retrievePassword(String phone, String pwd, String re_pwd) {
        HashMap<String, String> params = new HashMap<>();
        params.put("phone", phone);
        params.put("pwd", pwd);
        params.put("re_pwd", re_pwd);
        return api.retrievePassword(params);
    }
    @Override public Observable<Result<UserData>> login(String phone, String pwd) {
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("phone", phone);
        params.put("pwd", pwd);
        return api.login(params);
    }
}

