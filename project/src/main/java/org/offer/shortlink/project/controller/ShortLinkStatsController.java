package org.offer.shortlink.project.controller;

import lombok.RequiredArgsConstructor;
import org.offer.shortlink.project.common.convention.result.Result;
import org.offer.shortlink.project.common.convention.result.Results;
import org.offer.shortlink.project.dto.req.ShortLinkStatsReqDTO;
import org.offer.shortlink.project.dto.resp.ShortLinkStatsRespDTO;
import org.offer.shortlink.project.service.ShortLinkStatsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 短链接监控控制层
 */
@RestController
@RequiredArgsConstructor
public class ShortLinkStatsController {

    private final ShortLinkStatsService shortLinkStatsService;

    /**
     * 访问单个短链接指定时间内监控数据
     */
    @GetMapping("/api/short-link/v1/stats")
    public Result<ShortLinkStatsRespDTO> shortLinkStats(ShortLinkStatsReqDTO requestParam) {
        return Results.success(shortLinkStatsService.oneShortLinkStats(requestParam));
    }
}