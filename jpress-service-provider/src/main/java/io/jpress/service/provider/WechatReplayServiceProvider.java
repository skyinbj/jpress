package io.jpress.service.provider;

import com.jfinal.plugin.activerecord.Page;
import io.jboot.aop.annotation.Bean;
import io.jboot.db.model.Columns;
import io.jpress.commons.utils.SqlUtils;
import io.jpress.service.WechatReplayService;
import io.jpress.model.WechatReplay;
import io.jboot.service.JbootServiceBase;

import javax.inject.Singleton;

@Bean
@Singleton
public class WechatReplayServiceProvider extends JbootServiceBase<WechatReplay> implements WechatReplayService {


    @Override
    public Page<WechatReplay> _paginate(int page, int pageSize, String keyword, String content) {
        Columns columns = new Columns();
        SqlUtils.likeAppend(columns, "keyword", keyword);
        SqlUtils.likeAppend(columns, "content", content);

        return DAO.paginateByColumns(page, pageSize, columns, "id desc");
    }
}