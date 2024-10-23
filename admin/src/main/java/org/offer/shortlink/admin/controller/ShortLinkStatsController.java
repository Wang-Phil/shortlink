package org.offer.shortlink.admin.controller;

import lombok.RequiredArgsConstructor;
import org.offer.shortlink.admin.common.convention.result.Result;
import org.offer.shortlink.admin.dto.req.ShortLinkStatsReqDTO;
import org.offer.shortlink.admin.dto.resp.ShortLinkStatsRespDTO;
import org.offer.shortlink.admin.remote.ShortLinkRemoteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 短链接监控控制层
 */
@RestController
@RequiredArgsConstructor
public class ShortLinkStatsController {

    /**
     * 后续重构为 SpringCloud Feign 调用
     */
    ShortLinkRemoteService shortLinkRemoteService = new ShortLinkRemoteService() {
    };

    /**
     * 访问单个短链接指定时间内监控数据
     */
    @GetMapping("/api/short-link/admin/v1/stats")
    public Result<ShortLinkStatsRespDTO> shortLinkStats(ShortLinkStatsReqDTO requestParam) {
        return shortLinkRemoteService.oneShortLinkStats(requestParam);
    }
}

