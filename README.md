# 👋🧩 ReVanced Patches

![GitHub Workflow Status (with event)](https://img.shields.io/github/actions/workflow/status/fourjr/fourjr-revanced/release.yml)
![GPLv3 License](https://img.shields.io/badge/License-GPL%20v3-yellow.svg)

Custom patches made by [fourjr](https://github.com/fourjr)

## ❓ About

This is a repository made with [revanced-patches-template](https://github.com/ReVanced/revanced-patches-template), hosting revanced plugin to get premium acrobat.

## Add to Revanced
1. Ensure you are on a patcher-v20 compatible manager
2. Enable `Use alternative sources` 
3. Set patches organisation to `fourjr`
4. Set patches source to `fourjr-revanced`

## Patches

| App | Patch | Description |
| --- | --- | --- |
| com.adobe.reader | Unlock premium | Enables all premium features. You still have to log in for `Edit PDF`. |

## 🧑‍💻 Development

To develop and release ReVanced Patches using this template, some things need to be considered:

- Development starts in feature branches. Once a feature branch is ready, it is squashed and merged into the `dev` branch
- The `dev` branch is merged into the `main` branch once it is ready for release
- Semantic versioning is used to version ReVanced Patches. ReVanced Patches have a public API for other patches to use
- Semantic commit messages are used for commits
- Commits on the `dev` branch and `main` branch are automatically released
  via the [release.yml](.github/workflows/release.yml) workflow, which is also responsible for generating the changelog
  and updating the version of ReVanced Patches. It is triggered by pushing to the `dev` or `main` branch.
  The workflow uses the `publish` task to publish the release of ReVanced Patches
- The `buildAndroid` task is used to build ReVanced Patches so that it can be used on Android.
  The `publish` task depends on the `buildAndroid` task, so it will be run automatically when publishing a release.

## 📚 Everything else

### 🛠️ Building

```
gradlew apiDump - dumps the latest patches.api based on function signatures
gradlew build - Builds an exportable patch file
```

## 📜 Licence

ReVanced Patches is licensed under the GPLv3 licence.
Please see the [license file](LICENSE) for more information.
[tl;dr](https://www.tldrlegal.com/license/gnu-general-public-license-v3-gpl-3) you may copy, distribute
and modify ReVanced Patches template as long as you track changes/dates in source files.
Any modifications to ReVanced Patches must also be made available under the GPL,
along with build & install instructions.
