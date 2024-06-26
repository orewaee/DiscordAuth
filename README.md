# DiscordAuth

![DiscordAuth](pictures/banner.png)

DiscordAuth is a plugin that allows you to quickly and easily set up Discord authorization for your Velocity proxy.
At the moment the plugin is under development, so some parts of the plugin may be changed.
If any issue occurs, please report it to [`issues`](https://github.com/orewaee/DiscordAuth/issues).


## Attention

The project is currently being reworked. You can help by suggesting new features, code snippets or something like that. To do this, go to [Discord](https://discord.gg/4XqbAf4t72).


## Installation

To set up DiscordAuth, there are several steps you need to follow.

First you need to set up a Velocity proxy.
There must be at least two child servers, one of which will be a lobby.
Its name must be specified in `config.toml`.

It is also important to specify the Discord bot token and user ID,
which will be able to use the commands of this very bot in `config.toml`.

In general, these are all the necessary settings.

The properties found in the `config.toml` and `messages.toml` files can be freely modified.

Example of `config.toml` settings:

```toml
# Path to the file where player accounts will be stored
accounts_file_name = "plugins/DiscordAuth/accounts.json"

# Lifetime in seconds of the key and session, respectively
key_expiration_time = 60
session_expiration_time = 3600

# Server lobby name
lobby_server_name = "lobby"

# Discord bot token
bot_token = ""

# Discord admin
discord_admin_id = "a;b;c"
```


## Commands

### Discord

- `/add <name> <discord_id>` - adds a new account.
- `/remove <name> <discord_id>` - deletes an existing account.
- `/accounts` - displays a list of accounts.
- `/sync` - rename all guild members.

### Minecraft

- `/discordauth reload config` - reloads the plugin config.
- `/discordauth reload messages` - reloads the plugin messages.
- `/discordauth reload all` - reloads the plugin config and messages.

- `/account add <discord_id> <name>` - adds a new account.
- `/account Remove <discord_id> <name>` - deletes an existing account.
- `/test` is a temporary command needed for debugging.


## Accounts

Accounts are stored in JSON format. The schema is presented below:

```json
[
    {"name": "", "discordId": ""}
    ...
    {"name": "", "discordId": ""}
]
```


## Gallery

![](pictures/key.png)

![](pictures/minecraft_success.png)

![](pictures/discord_success.png)

![](pictures/discord_add.png)


## TODO
- [x] Version checking fixed
- [ ] Fix other managers
- [x] Separate config and messages
- [ ] Rewrite commands
- [ ] Add reload accounts feature
