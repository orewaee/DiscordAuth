package dev.orewaee.config;

import org.tomlj.Toml;
import org.tomlj.TomlParseResult;

import java.nio.file.Files;
import java.nio.file.Path;

public class TomlConfig {
    private static final Path path = Path.of("plugins/DiscordAuth/config.toml");
    private static TomlParseResult toml;

    public static void loadConfig() {
        Path directories = path.getParent();

        try {
            if (!Files.exists(directories))
                Files.createDirectories(directories);

            if (!Files.exists(path))
                Files.createFile(path);

            toml = Toml.parse(path);
        } catch (Exception exception) {
            System.out.println("Error 3");
            exception.printStackTrace();
        }
    }

    public static String getAccountsFileName() {
        return toml.getString("accounts_file_name");
    }

    public static Long getKeyExpirationTime() {
        return toml.getLong("key_expiration_time");
    }

    public static Long getSessionExpirationTime() {
        return toml.getLong("session_expiration_time");
    }

    public static String getLobbyServer() {
        return toml.getString("lobby_server");
    }

    public static String getBotToken() {
        return toml.getString("bot_token");
    }
}
