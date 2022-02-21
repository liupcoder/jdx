package cn.yiidii.jdx.model.enums;

import java.util.Objects;
import java.util.stream.Stream;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 社交平台枚举
 *
 * @author ed w
 * @since 1.0
 */
@Getter
@AllArgsConstructor
public enum SocialPlatformEnum {
    /**
     * github
     */
    GITHUB("Github", "https://github.com/", "PHN2ZyB0PSIxNjQ1MjczMTI2MDE4IiBjbGFzcz0iaWNvbiIgdmlld0JveD0iMCAwIDEwMjQgMTAyNCIgdmVyc2lvbj0iMS4xIiB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHAtaWQ9IjUzMDIiIHdpZHRoPSIzMiIgaGVpZ2h0PSIzMiI+PHBhdGggZD0iTTUxMS42IDc2LjNDMjY0LjMgNzYuMiA2NCAyNzYuNCA2NCA1MjMuNSA2NCA3MTguOSAxODkuMyA4ODUgMzYzLjggOTQ2YzIzLjUgNS45IDE5LjktMTAuOCAxOS45LTIyLjJ2LTc3LjVjLTEzNS43IDE1LjktMTQxLjItNzMuOS0xNTAuMy04OC45QzIxNSA3MjYgMTcxLjUgNzE4IDE4NC41IDcwM2MzMC45LTE1LjkgNjIuNCA0IDk4LjkgNTcuOSAyNi40IDM5LjEgNzcuOSAzMi41IDEwNCAyNiA1LjctMjMuNSAxNy45LTQ0LjUgMzQuNy02MC44LTE0MC42LTI1LjItMTk5LjItMTExLTE5OS4yLTIxMyAwLTQ5LjUgMTYuMy05NSA0OC4zLTEzMS43LTIwLjQtNjAuNSAxLjktMTEyLjMgNC45LTEyMCA1OC4xLTUuMiAxMTguNSA0MS42IDEyMy4yIDQ1LjMgMzMtOC45IDcwLjctMTMuNiAxMTIuOS0xMy42IDQyLjQgMCA4MC4yIDQuOSAxMTMuNSAxMy45IDExLjMtOC42IDY3LjMtNDguOCAxMjEuMy00My45IDIuOSA3LjcgMjQuNyA1OC4zIDUuNSAxMTggMzIuNCAzNi44IDQ4LjkgODIuNyA0OC45IDEzMi4zIDAgMTAyLjItNTkgMTg4LjEtMjAwIDIxMi45IDIzLjUgMjMuMiAzOC4xIDU1LjQgMzguMSA5MXYxMTIuNWMwLjggOSAwIDE3LjkgMTUgMTcuOSAxNzcuMS01OS43IDMwNC42LTIyNyAzMDQuNi00MjQuMSAwLTI0Ny4yLTIwMC40LTQ0Ny4zLTQ0Ny41LTQ0Ny4zeiIgcC1pZD0iNTMwMyIgZGF0YS1zcG0tYW5jaG9yLWlkPSJhMzEzeC43NzgxMDY5LjAuaTYiIGNsYXNzPSJzZWxlY3RlZCIgZmlsbD0iIzAwMDAwMCI+PC9wYXRoPjwvc3ZnPg=="),

    /**
     * gitee
     */
    GITEE("Gitee", "https://gitee.com/", "PHN2ZyB0PSIxNjQ1MjcxODQ2NTEwIiBjbGFzcz0iaWNvbiIgdmlld0JveD0iMCAwIDEwMjQgMTAyNCIgdmVyc2lvbj0iMS4xIiB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHAtaWQ9IjIwNTMiIHdpZHRoPSIzMiIgaGVpZ2h0PSIzMiI+PHBhdGggZD0iTTUxMiAxMDI0QzIyOS4yMjIgMTAyNCAwIDc5NC43NzggMCA1MTJTMjI5LjIyMiAwIDUxMiAwczUxMiAyMjkuMjIyIDUxMiA1MTItMjI5LjIyMiA1MTItNTEyIDUxMnogbTI1OS4xNDktNTY4Ljg4M2gtMjkwLjc0YTI1LjI5MyAyNS4yOTMgMCAwIDAtMjUuMjkyIDI1LjI5M2wtMC4wMjYgNjMuMjA2YzAgMTMuOTUyIDExLjMxNSAyNS4yOTMgMjUuMjY3IDI1LjI5M2gxNzcuMDI0YzEzLjk3OCAwIDI1LjI5MyAxMS4zMTUgMjUuMjkzIDI1LjI2N3YxMi42NDZhNzUuODUzIDc1Ljg1MyAwIDAgMS03NS44NTMgNzUuODUzaC0yNDAuMjNhMjUuMjkzIDI1LjI5MyAwIDAgMS0yNS4yNjctMjUuMjkzVjQxNy4yMDNhNzUuODUzIDc1Ljg1MyAwIDAgMSA3NS44MjctNzUuODUzaDM1My45NDZhMjUuMjkzIDI1LjI5MyAwIDAgMCAyNS4yNjctMjUuMjkybDAuMDc3LTYzLjIwN2EyNS4yOTMgMjUuMjkzIDAgMCAwLTI1LjI2OC0yNS4yOTNINDE3LjE1MmExODkuNjIgMTg5LjYyIDAgMCAwLTE4OS42MiAxODkuNjQ1Vjc3MS4xNWMwIDEzLjk3NyAxMS4zMTYgMjUuMjkzIDI1LjI5NCAyNS4yOTNoMzcyLjk0YTE3MC42NSAxNzAuNjUgMCAwIDAgMTcwLjY1LTE3MC42NVY0ODAuMzg0YTI1LjI5MyAyNS4yOTMgMCAwIDAtMjUuMjkzLTI1LjI2N3oiIGZpbGw9IiNDNzFEMjMiIHAtaWQ9IjIwNTQiPjwvcGF0aD48L3N2Zz4="),

    /**
     * baidu
     */
    BAIDU("Baidu", "https://baidu.com/", "PHN2ZyB0PSIxNjQ1NDMxMzM3MDYwIiBjbGFzcz0iaWNvbiIgdmlld0JveD0iMCAwIDEwMjQgMTAyNCIgdmVyc2lvbj0iMS4xIiB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHAtaWQ9IjE4OTkiIHdpZHRoPSIzMiIgaGVpZ2h0PSIzMiI+PHBhdGggZD0iTTE4NC42ODIwNTggNTM4Ljc1ODc3MWMxMTEuMTc2ODc3LTIzLjg3MzQ3OCA5Ni4wMjkwODYtMTU2LjczNjU5MyA5Mi43MDE2OS0xODUuNzc1Njc3LTUuNDQ0ODI4LTQ0Ljc2ODU4OC01OC4xMDE0MzYtMTIzLjAyMDU0Mi0xMjkuNjA1NTI2LTExNi44MzExMjItODkuOTc5Mjc2IDguMDc0MTY4LTEwMy4xMjU5NzcgMTM4LjA1MTk5MS0xMDMuMTI1OTc3IDEzOC4wNTE5OTEtMTIuMTY5NDI0IDYwLjA3OTI1OCAyOS4xMzIxNTggMTg4LjQ1MTU1NCAxNDAuMDI5ODEzIDE2NC41NTQ4MDh6IG0xMTguMDY0MzUyIDIzMS4xMDI3MDljLTMuMjU3NTkgOS4zMzA2NjctMTAuNTE3MzYgMzMuMjI3NDEzLTQuMjM0ODY3IDU0LjAyOTQ0OSAxMi40MDIxMDkgNDYuNjc2NjA0IDUyLjkxMjU2MSA0OC43NzA3NjkgNTIuOTEyNTYyIDQ4Ljc3MDc2OWg1OC4yMTc3NzhWNzMwLjM1MTU3MmgtNjIuMzM2MzAyYy0yOC4wMTUyNyA4LjM1MzM5LTQxLjUzNDI2NiAzMC4xNTU5NzItNDQuNTU5MTcxIDM5LjUwOTkwOHogbTg4LjI4MDY3Ni00NTMuODk4NTY0YzYxLjQwNTU2MyAwIDExMS4wMzcyNjYtNzAuNjY2NDI0IDExMS4wMzcyNjYtMTU4LjAzOTYyOSAwLTg3LjI4MDEzMS00OS42MzE3MDMtMTU3LjkyMzI4Ny0xMTEuMDM3MjY2LTE1Ny45MjMyODctNjEuMzEyNDg5IDAtMTExLjA2MDUzNCA3MC42NDMxNTYtMTExLjA2MDUzNCAxNTcuOTIzMjg3IDAgODcuMzczMjA1IDQ5Ljc3MTMxNCAxNTguMDM5NjI5IDExMS4wNjA1MzQgMTU4LjAzOTYyOXogbTI2NC40Njk3MzMgMTAuNDQ3NTU1YzgyLjA2Nzk4OCAxMC42NTY5NzEgMTM0Ljg0MDkzOC03Ni45MjU2NSAxNDUuMzM1MDMtMTQzLjMxMDY3MSAxMC43MDM1MDgtNjYuMjkxOTQ3LTQyLjI1NTU5LTE0My4yODc0MDItMTAwLjM1NzAyNi0xNTYuNTI3MTc3LTU4LjIxNzc3OS0xMy4zNTYxMTctMTMwLjkwODU2MiA3OS45MDQwMTctMTM3LjU0MDA4NCAxNDAuNzA0NTk5LTcuOTExMjg5IDc0LjMxOTU3OCAxMC42MzM3MDMgMTQ4LjU5MjYyIDkyLjU2MjA4IDE1OS4xMzMyNDl6IG0yMDEuMDg2MzQ4IDM5MC4yMTI2ODhzLTEyNi45NzYxODYtOTguMjM5NTkzLTIwMS4xMDk2MTctMjA0LjQxMzc0M2MtMTAwLjQ3MzM2OC0xNTYuNTUwNDQ1LTI0My4yMDIzMjctOTIuODQxMzAyLTI5MC45NDkyODItMTMuMjE2NTA2LTQ3LjUzNzUzOSA3OS42MDE1MjctMTIxLjYyNDQzMiAxMjkuOTU0NTU0LTEzMi4xNDE3OTIgMTQzLjI4NzQwMy0xMC42ODAyNCAxMy4xMjM0MzItMTUzLjM4NTkzIDkwLjE2NTQyNC0xMjEuNjk0MjM3IDIzMC44NzAwMjMgMzEuNjY4NDI0IDE0MC42MTE1MjUgMTQyLjkzODM3NSAxMzcuOTM1NjQ4IDE0Mi45MzgzNzQgMTM3LjkzNTY0OHM4MS45OTgxODIgOC4wNzQxNjggMTc3LjExOTc5Ny0xMy4yMTY1MDZjOTUuMTY4MTUxLTIxLjEwNDUyNiAxNzcuMDk2NTI4IDUuMjU4NjggMTc3LjA5NjUyOCA1LjI1ODY4MXMyMjIuMjgzOTQ4IDc0LjQzNTkyMSAyODMuMTA3Nzk4LTY4Ljg1MTQ4MmM2MC43NTQwNDUtMTQzLjMzMzkzOS0zNC4zNjc1Ny0yMTcuNjUzNTE4LTM0LjM2NzU2OS0yMTcuNjUzNTE4eiBtLTM4MC4zMjM1NzggMjEzLjI1NTc3MmgtMTQ0LjUyMDYzMmMtNjIuNDA2MTA4LTEyLjQ0ODY0Ni04Ny4yNTY4NjItNTUuMDI5OTk1LTkwLjM5ODExLTYyLjI4OTc2NS0zLjA3MTQ0Mi03LjM3NjExMy0yMC44MDIwMzYtNDEuNjA0MDcyLTExLjQyNDgzMi05OS44NDUxMTkgMjYuOTY4MTg4LTg3LjI1Njg2MiAxMDMuODcwNTY5LTkzLjUxNjA4OCAxMDMuODcwNTY5LTkzLjUxNjA4OGg3Ni45MjU2NXYtOTQuNTYzMTcxbDY1LjUyNDA4NyAxLjAwMDU0NnYzNDkuMjEzNTk3eiBtMjY5LjE0NjcwMS0xLjAwMDU0NWgtMTY2LjI5OTk0NmMtNjQuNDUzNzM2LTE2LjYxMzcwNy02Ny40NTUzNzItNjIuNDA2MTA4LTY3LjQ1NTM3MS02Mi40MDYxMDh2LTE4My44OTA5MjlsNjcuNDU1MzcxLTEuMDkzNjE5djE2NS4yNzYxMzFjNC4xMTg1MjQgMTcuNjM3NTIgMjYuMDE0MTc5IDIwLjgyNTMwNCAyNi4wMTQxOCAyMC44MjUzMDVoNjguNTI1NzIydi0xODUuMDA3ODE3aDcxLjc2MDA0NHYyNDYuMjk3MDM3eiBtMjM1LjQwNzM4LTQ5MC45ODg1NDhjMC0zMS43NjE0OTgtMjYuMzg2NDc1LTEyNy4zOTUwMTktMTI0LjIzMDUwMy0xMjcuMzk1MDE5LTk4LjAwNjkwOCAwLTExMS4xMDcwNzEgOTAuMjU4NDk4LTExMS4xMDcwNzIgMTU0LjA2MDcxNiAwIDYwLjg5MzY1NiA1LjE0MjMzOCAxNDUuODkzNDc0IDEyNi44ODMxMTIgMTQzLjE5NDMyOSAxMjEuNzg3MzExLTIuNjk5MTQ2IDEwOC40NTQ0NjMtMTM3LjkzNTY0OCAxMDguNDU0NDYzLTE2OS44NjAwMjZ6IG0wIDAiIGZpbGw9IiMzMjQ1REYiIHAtaWQ9IjE5MDAiPjwvcGF0aD48L3N2Zz4=")
    ;

    String displayName;
    String url;
    String iconBase64;

    public static SocialPlatformEnum get(String val) {
        return getOrDefault(val, null);
    }

    public static SocialPlatformEnum getOrDefault(String val, SocialPlatformEnum def) {
        if (Objects.isNull(val)) {
            return def;
        }
        return Stream.of(values()).parallel().filter(item -> item.name().equalsIgnoreCase(val)).findAny().orElse(def);
    }
}